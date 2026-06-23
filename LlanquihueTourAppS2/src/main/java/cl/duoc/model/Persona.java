package cl.duoc.model;

public class Persona {
    /**
     * @param nombre
     * @param apellido
     * @param tipo
     */
    private String nombre;
    private String apellido;
    private String tipo; //el tipo hace referencia a si es cliente, proveedor, guía turístico, etc.
//Constructor
    public Persona(String nombre, String apellido, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
    }
//Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

//To String
    public String toString() {
        return nombre + ";" + apellido + ";" + tipo;
    }
}
