package com.example.yulechave.proyectoanotaciones;

import java.time.LocalDate;
import java.util.Date;

public class Anotacion {

    private String titulo;
    private LocalDate fecha;
    private String anotacion;


    public Anotacion(String titulo, LocalDate fecha, String anotacion) {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }
}
