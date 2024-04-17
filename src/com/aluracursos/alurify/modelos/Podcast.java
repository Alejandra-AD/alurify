package com.aluracursos.alurify.modelos;

public class Podcast extends Audio {
    private String nombreProductora;
    private int temporadas;
    private int capitulosPorTemporadas;

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


}
