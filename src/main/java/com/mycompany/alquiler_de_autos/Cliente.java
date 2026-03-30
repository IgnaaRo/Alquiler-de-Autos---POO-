/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alquiler_de_autos;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Auto> autosAlquilados;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.autosAlquilados = new ArrayList<>();
    }

    public void alquilarAuto(Auto auto) {
        if (auto.isDisponible()) {
            auto.alquilar();
            autosAlquilados.add(auto);
        } else {
            System.out.println("El auto no está disponible");
        }
    }

    public void devolverAuto(Auto auto) {
        if (autosAlquilados.contains(auto)) {
            auto.devolver();
            autosAlquilados.remove(auto);
        } else {
            System.out.println("No tenés este auto");
        }
    }

    public void mostrarAutos() {
        System.out.println("Autos alquilados por " + nombre + ":");
        for (Auto a : autosAlquilados) {
            System.out.println("- " + a.getModelo());
        }
    }
}