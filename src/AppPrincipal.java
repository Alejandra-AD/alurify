import com.aluracursos.alurify.modelos.Cancion;
import com.aluracursos.alurify.modelos.Podcast;

public class AppPrincipal {
    public static void main(String[] args) {

        /*Cancion cancion = new Cancion();
        cancion.setNombre("One");
        cancion.setAlbum("And Justice for All");
        cancion.setArtista("Metallica");
        cancion.setDuracionEnMinutos(7.27);
        cancion.setFechaDeLanzamiento(1998);
        cancion.setTotalDeMeGustas(1000);
        cancion.fichaTecnica();*/


        /*nota: Al fabricar contructores necesariamente se deben utilizar de lo contrario indica un error*/

        Cancion cancion2 = new Cancion("Te pido",8000,2022,2,"Urbano",4000,8000,"Tini","Cupido");
        Podcast podcast1 = new Podcast("Tomás va a morir",2000,2020,120,"comedia 🤣",4000,2000,"Neverland",4,10);

        cancion2.fichaTecnica();
        cancion2.calcularPopularidad();
        podcast1.calcularPopularidad();

    }

}
