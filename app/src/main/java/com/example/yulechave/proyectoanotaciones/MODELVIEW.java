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
            if(a.getTitulo().toString().equals(titulo)){
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

    public int Buscar(Anotacion a){
        int i = blocnotas.indexOf(a);
        return i;
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

    public void Modificar (int pos, String anotacion, LocalDate fecha, String titulo){
        blocnotas.get(pos).setAnotacion(anotacion);
        blocnotas.get(pos).setFecha(fecha);
        blocnotas.get(pos).setTitulo(titulo);
    }

    public void Eliminar (Anotacion a){
        blocnotas.remove(a);
    }
}
