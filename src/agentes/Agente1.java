package agentes;

import Agenetico.Genetica;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

/**
 * Clase que se encarga de la configuracion del Agente 1.
 * El agente 1 se encarga de la evolucion de la poblacion y de enviar el resultado al agente 2.
 * @author Angel Chuncho
 * @version 1.0, 08/05/2024
 */
public class Agente1 extends Agent {
    // Cuerpo del agente usando la libreria jade
    /**
     * Configuracion del agente.
     * Se le asigna un comportamiento al agente como una instancia.
     */
    @Override
    protected void setup(){
        addBehaviour(new Comportamiento());
    }

    /**
     * Clase o subclase que se encarga del comportamiento del Agente 1.
     * Presenta metodos encargados de la evolucion de la poblacion y de enviar el resultado al agente 2.
     * Hereda de la libreria pero especificando el tipo (simple o cyclic), parallel se configura en setup().
     */
    class Comportamiento extends Behaviour {
        /**
         * Metodo que se encarga de la accion del agente, lo que se desea que el agente haga.
         * En este caso, se encarga de la evolucion de la poblacion y de enviar el resultado al agente 2.
         */
        @Override
        public void action(){
            System.out.println(getName());
            // (x, y) del AG
            int tamanioPoblacion = 3;
            int longCromosoma = 12;
            int iteraccion = 5;
            int evoluciones = 8;
            Genetica genetica = new Genetica();
            int[] xy = genetica.evolucionar(genetica.get_Poblacion(genetica.configurarAG(tamanioPoblacion, longCromosoma)), evoluciones, iteraccion);
            int x = xy[0];
            int y = xy[1];
            // enviar (x, y) al Agente 2
            Comunicacion.msj(ACLMessage.INFORM, getAgent(), "Ag2", x + " ; " + y, null, "CD-01-02");
        }

        /**
         * Metodo que se encarga de la finalizacion del agente.
         * @return  True si el agente finalizo, False en caso contrario.
         */
        @Override
        public boolean done() {
            return true;
        }
    }

}
