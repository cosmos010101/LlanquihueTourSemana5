package cl.duoc.model;

public class Tour {
    /**
     * @param experiencia
     * @param ciudad
     * @param duracion
     * @param precio
     */
    private String experiencia;
    private String ciudad;
    private String duracion;
    private int precio;
//Constructor
    public Tour(String experiencia, String ciudad, String duracion, int precio) {
        this.experiencia = experiencia;
        this.ciudad = ciudad;
        this.duracion = duracion;
        this.precio = precio;
    }
//Getters y Setters
    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
//To String
    public String toString() {
        return experiencia +
                ";" + ciudad +
                ";" + duracion +
                ";" + precio;
    }
}
