package com.example.yulechave.proyectoanotaciones;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class MODELVIEW {

     private ArrayList<Anotacion> blocnotas;

    public MODELVIEW() {
        blocnotas=new ArrayList<Anotacion>();
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

    public ArrayList<Anotacion> Buscar (int mes){
        ArrayList<Anotacion> anotMes = new ArrayList<Anotacion>();
        for (Anotacion a: blocnotas) {
            if(a.getFecha().getMonth().equals(Month.of(mes))){
                anotMes.add(a);
            }
        }
        return anotMes;
    }

    public void Agregar (Anotacion a){
        blocnotas.add(a);
    }

    public void Modificar (String titulo){

    }
}
