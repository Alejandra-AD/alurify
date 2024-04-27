import com.aluracursos.alurify.modelos.Cancion;
import com.aluracursos.alurify.modelos.Podcast;

public class AppPrincipal {
    public static void main(String[] args) {

        String logo = """
                 ______      ___                                 ____                         \s
                /\\  _  \\    /\\_ \\                               /\\  _`\\                       \s
                \\ \\ \\L\\ \\   \\//\\ \\     __  __   _ __     __     \\ \\ \\L\\_\\ __  __              \s
                 \\ \\  __ \\    \\ \\ \\   /\\ \\/\\ \\ /\\`'__\\ /'__`\\    \\ \\  _\\//\\ \\/\\ \\             \s
                  \\ \\ \\/\\ \\    \\_\\ \\_ \\ \\ \\_\\ \\\\ \\ \\/ /\\ \\L\\.\\_   \\ \\ \\/ \\ \\ \\_\\ \\            \s
                   \\ \\_\\ \\_\\   /\\____\\ \\ \\____/ \\ \\_\\ \\ \\__/.\\_\\   \\ \\_\\  \\/`____ \\           \s
                    \\/_/\\/_/   \\/____/  \\/___/   \\/_/  \\/__/\\/_/    \\/_/   `/___/> \\          \s
                                                                              /\\___/          \s
                                                                              \\/__/\s
       
                """;
        System.out.println(logo);
        /*Cancion cancion = new Cancion();
        cancion.setNombre("One");
        cancion.setAlbum("And Justice for All");
        cancion.setArtista("Metallica");
        cancion.setDuracionEnMinutos(7.27);
        cancion.setFechaDeLanzamiento(1998);
        cancion.setTotalDeMeGustas(1000);
        cancion.fichaTecnica();*/


        /*nota: Al fabricar contructores necesariamente se deben utilizar de lo contrario indica un error*/
        Cancion cancion1 = new Cancion("One",12000,1998,7.27,"Metal",2400,"Metallica","And Justice for All");
        Cancion cancion2 = new Cancion("Te pido",8000,2022,2,"Urbano",4000,"Tini","Cupido");
        Podcast podcast1 = new Podcast("Tomás va a morir",2000,2020,120,"comedia 🤣",4000,"Estudios Neverland",4,10);

        cancion1.fichaTecnica();
        cancion2.fichaTecnica();
        podcast1.fichaTecnica();

    }

}
