package com.company;

import java.time.LocalDate;

/**
 * Created by 54167208T on 13/12/2016.
 */
public class Videojuego {

    public Videojuego(long id, String nombre, double precio, String empresa, LocalDate fecha_lanzamiento, int n_ventas, String genero, String pegi, int n_jugadores, String plataforma) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.empresa = empresa;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.n_ventas = n_ventas;
        this.genero = genero;
        this.pegi = pegi;
        this.n_jugadores = n_jugadores;
        this.plataforma = plataforma;
    }

    private long id;
    private String nombre;
    private double precio;
    private String empresa;
    private LocalDate fecha_lanzamiento;
    private int n_ventas;
    private String genero;
    private String pegi;
    private int n_jugadores;
    private String plataforma;

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public LocalDate getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(LocalDate fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public int getN_ventas() {
        return n_ventas;
    }

    public void setN_ventas(int n_ventas) {
        this.n_ventas = n_ventas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPegi() {
        return pegi;
    }

    public void setPegi(String pegi) {
        this.pegi = pegi;
    }

    public int getN_jugadores() {
        return n_jugadores;
    }

    public void setN_jugadores(int n_jugadores) {
        this.n_jugadores = n_jugadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", empresa='" + empresa + '\'' +
                ", fecha_lanzamiento=" + fecha_lanzamiento +
                ", n_ventas=" + n_ventas +
                ", genero='" + genero + '\'' +
                ", pegi='" + pegi + '\'' +
                ", n_jugadores=" + n_jugadores +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
