/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglo0201;

import java.time.LocalDate;

/**
 *
 * @author LAB-2
 */
public class Atencion {
    
    private LocalDate fecha;
    private String veterinario;
    private double costo;
    private Mascota mascota;
    private int cantidadRecetas;
    private Receta[] recetalist;
    
    public void nuevaReceta(String medicamento, int cantidad, String indicacion,int posicion){
        var receta=new Receta(medicamento, cantidad, indicacion);
        this.recetalist[posicion]=receta;
    
    }

    public Atencion(LocalDate fecha, String veterinario, double costo, Mascota mascota, int cantidadRecetas) {
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.costo = costo;
        this.mascota = mascota;
        this.cantidadRecetas = cantidadRecetas;
        this.recetalist = new Receta[this.cantidadRecetas];
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public int getCantidadRecetas() {
        return cantidadRecetas;
    }

    public void setCantidadRecetas(int cantidadRecetas) {
        this.cantidadRecetas = cantidadRecetas;
    }

    public Receta[] getRecetalist() {
        return recetalist;
    }

    public void setRecetalist(Receta[] recetalist) {
        this.recetalist = recetalist;
    }

    @Override
    public String toString() {
        return "Atencion{" + "fecha=" + fecha + ", veterinario=" + veterinario + ", costo=" + costo + ", mascota=" + mascota + ", cantidadRecetas=" + cantidadRecetas + ", recetalist=" + recetalist + '}';
    }
    
    
}
