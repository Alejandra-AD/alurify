package com.aluracursos.alurify.modelos;

import com.aluracursos.alurify.interfaces.CalcularPopularidad;
import com.aluracursos.alurify.interfaces.Play;

public class Cancion extends Audio implements CalcularPopularidad, Play {

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

    public void play(){
        System.out.println(
                """
                        ...............................................................
                                 _____                      _               \s
                                /  __ \\                    (_)              \s
                                | /  \\/  __ _  _ __    ___  _   ___   _ __  \s
                                | |     / _` || '_ \\  / __|| | / _ \\ | '_ \\ \s
                                | \\__/\\| (_| || | | || (__ | || (_) || | | |\s
                                 \\____/ \\__,_||_| |_| \\___||_| \\___/ |_| |_|
                        ...............................................................
                        
                        Ahora reproduciendo: %s
                        • %s •
                        ────────⚪────────
                        ◄◄⠀▐▐ ⠀►►
                        0:00 / 0:00 ───○ 🔊⠀ ᴴᴰ ⚙ ❐ ⮎1⮌
                        """.formatted(getNombre(), getArtista())
        );
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
       """);


        System.out.println("\n");

    }
}
