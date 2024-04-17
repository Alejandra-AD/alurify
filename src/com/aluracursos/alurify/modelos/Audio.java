package com.aluracursos.alurify.modelos;

public class Audio {
    private String nombre;
    private int reproducciones;
    private int fechaDeLanzamiento;
    private double duracionEnMinutos;

    private String clasificacion;


    //getters
    public String getNombre(){
        return nombre;
    }
    public String getClasificacion(){
        return clasificacion;
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

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setClasificacion(String clasificacion){
        this.clasificacion = clasificacion;
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




}
