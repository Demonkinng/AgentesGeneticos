package agentes;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

/**
 * Clase que se encarga de la configuracion del Agente 2.
 * El agente 2 se encarga de recibir el resultado del agente 1 y mostrar el mensaje en pantalla.
 * @author Angel Chuncho
 * @version 1.0, 08/05/2024
 */
public class Agente2 extends Agent {
    // Cuerpo del agente usando la libreria
    /**
     * Configuracion del agente.
     * Se le asigna un comportamiento al agente como una instancia.
     */
    @Override
    protected void setup(){
        addBehaviour(new Comportamiento());
    }

    /**
     * Clase o subclase que se encarga del comportamiento del Agente 2.
     * Presenta metodos encargados de recibir el resultado del agente 1 y mostrar el mensaje en pantalla.
     * Hereda de la libreria pero especificando el tipo (simple o cyclic), parallel se configura en setup().
     */
    class Comportamiento extends Behaviour {
        /**
         * Metodo que se encarga de la accion del agente, lo que se desea que el agente haga.
         * En este caso, se encarga de recibir el resultado del agente 1 y mostrar el mensaje en pantalla.
         */
        @Override
        public void action(){
            // Bloquear la recepcion de mensajes a los agentes que no inician la conversacion
            ACLMessage aclmsj = blockingReceive();
            // Imprimir toda la informacion que contiene la comunicacion
            System.out.println(aclmsj);
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
