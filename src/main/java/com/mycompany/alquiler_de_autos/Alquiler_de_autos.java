/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alquiler_de_autos;

/**
 *
 * @author PC
 */
public class Alquiler_de_autos {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Auto auto1 = new Auto("ABC123", "Toyota Corolla");
        Auto auto2 = new Auto("XYZ789", "Ford Fiesta");

        Cliente cliente1 = new Cliente("Ignacio");

        empresa.agregarAuto(auto1);
        empresa.agregarAuto(auto2);
        empresa.registrarCliente(cliente1);

        empresa.mostrarAutosDisponibles();

        System.out.println("\n--- Alquiler ---");
        cliente1.alquilarAuto(auto1);

        System.out.println("\n--- Estado del cliente ---");
        cliente1.mostrarAutos();

        System.out.println("\n--- Devolución ---");
        cliente1.devolverAuto(auto1);

        System.out.println("\n--- Estado final ---");
        cliente1.mostrarAutos();
    }
}
