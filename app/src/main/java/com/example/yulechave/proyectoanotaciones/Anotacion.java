package com.example.yulechave.proyectoanotaciones;

public class Anotacion {

    private String titulo;
    private String fecha;
    private String anotacion;


    public Anotacion(String titulo, String fecha, String anotacion) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.anotacion = anotacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }
}
