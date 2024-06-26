package com.aluracursos.alurify.modelos;

public class Audio {
    private String nombre;
    private int reproducciones;
    private int fechaDeLanzamiento;
    private double duracionEnMinutos;

    private String genero;
    private double totalDeMeGustas;

    //constructor de audio


    public Audio(String nombre, int reproducciones, int fechaDeLanzamiento, double duracionEnMinutos, String genero, double totalDeMeGustas) {
        this.nombre = nombre;
        this.reproducciones = reproducciones;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
        this.totalDeMeGustas = totalDeMeGustas;
    }

    //getters
    public String getNombre(){
        return nombre;
    }

    public int getReproducciones(){
        return reproducciones;
    }
    public int getFechaDeLanzamiento(){
        return fechaDeLanzamiento;
    }
    public double getDuracionEnMinutos(){
        return fechaDeLanzamiento;
    }
    public String getGenero() {
        return genero;
    }

    public double getTotalDeMeGustas() {
        return totalDeMeGustas;
    }




    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento){
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    public void setDuracionEnMinutos(double duracionEnMinutos){
        this.duracionEnMinutos = duracionEnMinutos;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void setTotalDeMeGustas(double totalDeMeGustas) {
        this.totalDeMeGustas = totalDeMeGustas;
    }


    //metodos publicos





}
