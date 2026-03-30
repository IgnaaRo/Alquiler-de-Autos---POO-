/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alquiler_de_autos;

/**
 *
 * @author PC
 */
import java.time.LocalDate;

public class Alquiler {
    private Auto auto;
    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Alquiler(Auto auto, Cliente cliente) {
        this.auto = auto;
        this.cliente = cliente;
        this.fechaInicio = LocalDate.now();
    }

    public void finalizarAlquiler() {
        this.fechaFin = LocalDate.now();
        auto.devolver();
    }

    public void mostrarInfo() {
        System.out.println("Auto: " + auto.getModelo());
        System.out.println("Cliente: " + cliente);
        System.out.println("Inicio: " + fechaInicio);
        System.out.println("Fin: " + fechaFin);
    }
}