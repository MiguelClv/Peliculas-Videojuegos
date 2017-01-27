package com.company;

/**
 * Created by 54167208T on 09/12/2016.
 */
public class Pelicula {

        private long id;
        private String nombre;
        private int año;
        private String sinopsis;
        private String genero;
        private double precioentrada;
        private int taquilla;
        private double recaudacion;

    public Pelicula(long id, String nombre, int año, String sinopsis, String genero, double precioentrada, int taquilla) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.precioentrada = precioentrada;
        this.taquilla = taquilla;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecioentrada() {
        return precioentrada;
    }

    public void setPrecioentrada(double precioentrada) {
        this.precioentrada = precioentrada;
    }

    public int getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(int taquilla) {
        this.taquilla = taquilla;
    }

    public double getrecaudacion() {
        recaudacion = precioentrada*taquilla;
        return recaudacion;
    }


    @Override
        public String toString() {
            return "Pelicula{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", año=" + año +
                    ", sinopsis='" + sinopsis + '\'' +
                    ", genero='" + genero + '\'' +
                    ", precio entrada='" + precioentrada + '\'' +
                    ", taquilla='" + taquilla + '\'' +
                    ", recaudacion='" + getrecaudacion() + '\'' +
                    '}';
        }
}
