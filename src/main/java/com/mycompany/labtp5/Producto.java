/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtp5;

/**
 *
 * @author Estudiante
 */
public class Producto  {
    private String categoria;
    private String Nombre;
    private double precio;

    public Producto(String categoria, String Nombre, double precio) {
        this.categoria = categoria;
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
