import com.aluracursos.alurify.modelos.Cancion;

public class AppPrincipal {
    public static void main(String[] args) {

        Cancion cancion = new Cancion();
        cancion.setNombre("One");
        cancion.setAlbum("And Justice for All");
        cancion.setArtista("Metallica");
        cancion.setDuracionEnMinutos(7.27);
        cancion.setFechaDeLanzamiento(1998);
        cancion.fichaTecnica();



    }

}
