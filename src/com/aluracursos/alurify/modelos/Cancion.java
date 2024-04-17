package com.aluracursos.alurify.modelos;

public class Cancion extends Audio {

    private String artista;
    private String album;

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

    public void fichaTecnica(){
        System.out.println("Información");
        System.out.println(getNombre());
        System.out.println(getFechaDeLanzamiento());
        System.out.println(getAlbum());
        System.out.println(getArtista());
    }
}
