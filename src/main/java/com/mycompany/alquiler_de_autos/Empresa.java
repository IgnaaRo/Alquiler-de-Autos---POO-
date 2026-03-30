/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alquiler_de_autos;

/**
 *
 * @author PC
 */
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Auto> autos;
    private ArrayList<Cliente> clientes;

    public Empresa() {
        autos = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostrarAutosDisponibles() {
        for (Auto a : autos) {
            if (a.isDisponible()) {
                System.out.println(a.getModelo());
            }
        }
    }
}