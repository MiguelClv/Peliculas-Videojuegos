package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

            Pelicula theRevenant = new Pelicula(1l,"The Revenant", 2015, "Año 1823...","Acción",6.5,500);
            Pelicula shutterIsland = new Pelicula(2l,"Shutter Island", 2010, "En el verano de 1954...","Thriller",7.5,250);
            Pelicula inception = new Pelicula(3l,"Inception", 2010, "Un ladrón...","Thriller",3.5,400);

            List<Pelicula> peliculaList = new ArrayList<>();

            peliculaList.add(theRevenant);
            peliculaList.add(shutterIsland);
            peliculaList.add(inception);

            for (Pelicula pelicula : peliculaList) {

                if (pelicula.getrecaudacion()<2000){
                    System.out.println(pelicula);
                }

            }

// peliculaList.
// stream().
// filter(pelicula -> pelicula.getAño() == 2010).
// forEach(pelicula -> System.out.println(pelicula));







        }
}
