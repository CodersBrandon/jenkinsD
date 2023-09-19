package edu.uagrm.hotelhub.model;

import lombok.Data;

@Data
public class Hotel {
    //Atibutos
    private String nombre;
    private String direcion;

    public Hotel(String nombre, String direcion, double precioPorNoche, double calificacion) {
        this.nombre = nombre;
        this.direcion = direcion;
        this.precioPorNoche = precioPorNoche;
        this.calificacion = calificacion;
    }
    public Hotel(){

    }

    public Hotel(String nombre, String direcion, double precioPorNoche) {
        this.nombre = nombre;
        this.direcion = direcion;
        this.precioPorNoche = precioPorNoche;
    }

    private double precioPorNoche;
    private double calificacion;
}
