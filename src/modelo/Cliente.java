package modelo;

import java.io.Serializable;

/**
 * Clase que representa un cliente.
 * Un cliente tiene un nombre, apellido, id, edad y telefono.
 * @author Angel Chuncho
 * @version 1.0, 08/05/2024
 */
public class Cliente implements Serializable {
    private String nombre, apellido, id;
    private int edad, telefono;

    /**
     * Constructor por defecto.
     */
    public Cliente() {
    }

    /**
     * Constructor con parametros.
     * @param nombre    Nombre del cliente.
     * @param apellido  Apellido del cliente.
     * @param id        Identificacion del cliente.
     * @param edad      Edad del cliente.
     * @param telefono  Telefono del cliente.
     */
    public Cliente(String nombre, String apellido, String id, int edad, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return  Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre    Nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del cliente.
     * @return  Apellido del cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del cliente.
     * @param apellido  Apellido del cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la identificacion del cliente.
     * @return Identificacion del cliente.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece la identificacion del cliente.
     * @param id    Identificacion del cliente.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene la edad del cliente.
     * @return Edad del cliente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del cliente.
     * @param edad  Edad del cliente.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el telefono del cliente.
     * @return Telefono del cliente.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el telefono del cliente.
     * @param telefono Telefono del cliente.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
