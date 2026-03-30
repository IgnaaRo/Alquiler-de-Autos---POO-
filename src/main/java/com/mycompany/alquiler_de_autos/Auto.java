/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alquiler_de_autos;

public class Auto {
    private String patente;
    private String modelo;
    private boolean disponible;

    public Auto(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        this.disponible = true;
    }

    public void alquilar() {
        if (disponible) {
            disponible = false;
            System.out.println("Auto alquilado: " + modelo);
        } else {
            System.out.println("No disponible");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Auto devuelto: " + modelo);
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getModelo() {
        return modelo;
    }
}
