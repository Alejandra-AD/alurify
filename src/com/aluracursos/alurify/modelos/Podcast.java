package com.aluracursos.alurify.modelos;

import com.aluracursos.alurify.interfaces.CalcularPopularidad;

public class Podcast extends Audio implements CalcularPopularidad {
    private String nombreProductora;
    private int temporadas;
    private int capitulosPorTemporadas;


    //constructor

    public Podcast(String nombre, int reproducciones, int fechaDeLanzamiento, double duracionEnMinutos, String genero, double totalDeMeGustas, int nroReproducciones, String nombreProductora, int temporadas, int capitulosPorTemporadas) {
        super(nombre, reproducciones, fechaDeLanzamiento, duracionEnMinutos, genero, totalDeMeGustas, nroReproducciones);
        this.nombreProductora = nombreProductora;
        this.temporadas = temporadas;
        this.capitulosPorTemporadas = capitulosPorTemporadas;
    }


    //getters

    public String getNombreProductora(){
        return nombreProductora;
    }

    public int getTemporadas(){
        return temporadas;
    }

    public int getCapitulosPorTemporadas(){
        return capitulosPorTemporadas;
    }

    //setters

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;

    }

    public void setNombreProductora(String nombreProductora){
        this.nombreProductora = nombreProductora;
    }

    public void setCapitulosPorTemporadas(int capitulosPorTemporadas){
        this.capitulosPorTemporadas = capitulosPorTemporadas;
    }
    @Override
    public void calcularPopularidad(){
        if (getNroReproducciones()>=500){
            System.out.println("Uno de los Podcast mas populares de " + getGenero() + ".");
        } else if (getNroReproducciones()>=200) {
            System.out.println("Ayuda a crecer a este podcast");
        }
        else{
            System.out.println("lanzamiento reciente");
        }

    }


}
