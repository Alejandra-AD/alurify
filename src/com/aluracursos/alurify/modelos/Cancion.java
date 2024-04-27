package com.aluracursos.alurify.modelos;

import com.aluracursos.alurify.interfaces.CalcularPopularidad;

public class Cancion extends Audio implements CalcularPopularidad {

    private String artista;
    private String album;

    public Cancion(String nombre, int reproducciones, int fechaDeLanzamiento, double duracionEnMinutos, String genero, double totalDeMeGustas, String artista, String album) {
        super(nombre, reproducciones, fechaDeLanzamiento, duracionEnMinutos, genero, totalDeMeGustas);
        this.artista = artista;
        this.album = album;
    }


    //getters

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }


    //setters

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }


    @Override
    public void calcularPopularidad() {
        if (getTotalDeMeGustas() >= 9000) {
            System.out.println("Con mas me gustas ♥️");
        } else if (getTotalDeMeGustas() >= 2000) {
            System.out.println("En favoritos de Alurify 😊");
        } else {
            System.out.println("lanzamiento reciente 🥵");
        }
    }

    public void fichaTecnica(){
        System.out.println("""
       ...............................................................
       Ejemplo Objeto Canción : "Información"
       ...............................................................
       """);
        System.out.println("Nombre = " + getNombre());
        System.out.println("Fecha de lanzamiento = " + getFechaDeLanzamiento());
        System.out.println("Álbum = " + getAlbum());
        System.out.println("Artista = " + getArtista());
        calcularPopularidad();
        System.out.println("""
       ...............................................................
       ...............................................................
       """);


        System.out.println("\n");

    }
}
