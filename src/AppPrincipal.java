import com.aluracursos.alurify.modelos.Cancion;
import com.aluracursos.alurify.modelos.Podcast;

public class AppPrincipal {
    public static void main(String[] args) {

        String logo = """
                   ____     _____       __    __   ______      _____   _________  __      __   \s
                  (    )   (_   _)      ) )  ( (  (   __ \\    (_   _) (_   _____) ) \\    / (   \s
                  / /\\ \\     | |       ( (    ) )  ) (__) )     | |     ) (___     \\ \\  / /    \s
                 ( (__) )    | |        ) )  ( (  (    __/      | |    (   ___)     \\ \\/ /     \s
                  )    (     | |   __  ( (    ) )  ) \\ \\  _     | |     ) (          \\  /      \s
                 /  /\\  \\  __| |___) )  ) \\__/ (  ( ( \\ \\_))   _| |__  (   )          )(       \s
                /__(  )__\\ \\________/   \\______/   )_) \\__/   /_____(   \\_/          /__\\         \s
                                
                                
                """;
        System.out.println(logo);

        /*nota: Al utilizar contructores necesariamente se debe crear el objeto con este y modificar valores con set*/
        Cancion cancion1 = new Cancion("One",12000,1998,7.27,"Metal",9400,"Metallica","And Justice for All");
        Cancion cancion2 = new Cancion("Te pido",8000,2022,2,"Urbano",4000,"Tini","Cupido");
        Podcast podcast1 = new Podcast("Tomás va a morir",2000,2020,120,"comedia 🤣",4000,"Estudios Neverland",4,10);

        cancion1.play();
        cancion1.fichaTecnica();
        cancion2.play();
        cancion2.fichaTecnica();
        podcast1.play();
        podcast1.fichaTecnica();

    }

}
