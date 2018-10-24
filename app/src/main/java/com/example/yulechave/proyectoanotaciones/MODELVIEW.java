package com.example.yulechave.proyectoanotaciones;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

public class MODELVIEW {

     private ArrayList<Anotacion> blocnotas;

    public MODELVIEW() {
    }

    public Anotacion Buscar(String titulo){
        for(Anotacion a: blocnotas){
            if(a.getTitulo().equals(titulo)){
                return a;
            }
        }
        return null;
    }

    public Anotacion Buscar (LocalDate fecha){
        for (Anotacion a: blocnotas) {
            if(a.getFecha().equals(fecha)){
                return a;
            }
        }
        return null;
    }

    public Anotacion BuscarMes (int mes){
        for (Anotacion a: blocnotas) {
            if(a.getFecha().getMonth().equals(Month.of(mes))){
                return a;
            }
        }
        return null;
    }

    public void Agregar (Anotacion a){
        blocnotas.add(a);
    }

    public void Modificar (String titulo){

    }
}
