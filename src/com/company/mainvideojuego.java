package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 54167208T on 13/12/2016.
 */
public class mainvideojuego {
    public static void main(String[] args) {

        Videojuego TheLasOfUs = new Videojuego(1,"The Last Of Us", 27.95 ,"Naughty Dog", LocalDate.of(2013,6,14),7000000,"Supervivencia","Pegi +18",1,"PlayStation 4 PlayStation 3");
        Videojuego Uncharted4 = new Videojuego(2,"Uncharted 4", 45.95 ,"Naughty Dog", LocalDate.of(2016,5,10),2700000,"Supervivencia, Accion","Pegi +16",1,"PlayStation 4");
        Videojuego Fifa17 = new Videojuego(3,"Fifa 17", 57, "EA Sport", LocalDate.of(2016,9,27),10000000,"Deportes","Pegi +3",6,"PlayStation 4, Xbox One, PlayStation 3, Xbox 360, Microsoft Windows");
        Videojuego Pes17 = new Videojuego(4,"Pro Evolution Soccer 17", 24.95, "Konami", LocalDate.of(2016,6,1),100000,"Deportes","Pegi +3",6,"PlayStation 4, Xbox One, PlayStation 3, Xbox 360, Microsoft Windows");
        Videojuego GTAV = new Videojuego(5,"Grand Theft Auto V", 47.95 , "Rock Start Game", LocalDate.of(2013,9,17),9000000,"Mundo Abierto","Pegi +18",1,"PlayStation 4, PlayStation 3, Xbox One, Xbox 360, Microsoft Windows");
        Videojuego Minecraft = new Videojuego(6,"Minecraft", 18.95 , "Markus Persson, Jens Bergensten", LocalDate.of(2011,10,7),8500000,"Supervivencia, Mundo Abierto","Pegi +3",1,"Android, PlayStation 4, Xbox 360, iOS, Xbox One");
        Videojuego CODBO3 = new Videojuego(7,"Call Of Duty Black Ops 3", 54.95 , "Activision", LocalDate.of(2015,11,6),5500000,"Shooter","Pegi +18",4,"PlayStation 4, Xbox One, PlayStation 3, Xbox 360, Microsoft Windows");
        Videojuego FFXV = new Videojuego(8,"Final Fantasy XV", 57.95 , " Square Enix", LocalDate.of(2016,11,29),10500000,"Aventura","Pegi +18",1," PlayStation 4, Xbox One");
        Videojuego WatchDogs2 = new Videojuego(9,"Watch Dogs 2", 59.95 , "Ubisoft", LocalDate.of(2016,11,15),7600000,"Accion","Pegi +18",1,"PlayStation 4, Xbox One, Microsoft Windows");
        Videojuego WatchDogs = new Videojuego(10,"Watch Dogs", 19.95 , "Ubisoft", LocalDate.of(2014,5,27),7500000,"Accion","Pegi +18",1,"PlayStation 4, Xbox One, Microsoft Windows");

        List<Videojuego> videojuegoslista = new ArrayList<>();

        videojuegoslista.add(TheLasOfUs);
        videojuegoslista.add(Uncharted4);
        videojuegoslista.add(Fifa17);
        videojuegoslista.add(Pes17);
        videojuegoslista.add(GTAV);
        videojuegoslista.add(Minecraft);
        videojuegoslista.add(CODBO3);
        videojuegoslista.add(FFXV);
        videojuegoslista.add(WatchDogs);
        videojuegoslista.add(WatchDogs2);

        videojuegoslista.sort(Comparator.comparing(Videojuego::getN_ventas).reversed());

        System.out.println("- TOP 5 de los Videojuego mas jugados:");
        for (Videojuego top5: videojuegoslista.subList(0,5)){
            System.out.println(top5.getNombre());
        }

        System.out.println("-------------------------------------");

        System.out.println("- Juegos lanzados entre 2014 y finales de 2015:");
        for (Videojuego v: videojuegoslista) {
            if (v.getFecha_lanzamiento().isBefore(LocalDate.of(2015,12,31)) && v.getFecha_lanzamiento().isAfter(LocalDate.of(2014,1,1))){
                System.out.println(v.getNombre());
            }
        }

        System.out.println("-------------------------------------");

        System.out.println("- Juegos lanzados entre 2015 y la fecha actual, siendo Naughty Dog la empresa creadora del videojuego, y ventas superiores a 1M:");
        for (Videojuego v: videojuegoslista) {
            if (v.getFecha_lanzamiento().isBefore(LocalDate.now()) && v.getFecha_lanzamiento().isAfter(LocalDate.of(2015,1,1))){
                if (v.getEmpresa().equals("Naughty Dog") && v.getN_ventas()>1000000){
                    System.out.println(v.getNombre());
                }
            }
        }

        System.out.println("-------------------------------------");

        System.out.println("- Juegos que tengan un precio entre 20e y 50e, y que sea de plataforma PS4:");
        for (Videojuego v: videojuegoslista) {
            if (v.getPlataforma().contains("PlayStation 4")){
                if (v.getPrecio()<50 && v.getPrecio()>20){
                System.out.println(v.getNombre());
                }
            }
        }
    }
}
