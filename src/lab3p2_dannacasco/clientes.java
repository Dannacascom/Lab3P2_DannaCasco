/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_dannacasco;

import java.util.ArrayList;

/**
 *
 * @author Danna Casco
 */
class clientes   {
    
    private int id;
    private String nombre;
    private ArrayList<vehiculos> v = new ArrayList();
    private double saldo;

    public clientes() {
    }

    public clientes(int id, String nombre, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "--Cliente--" + "\nid: " + id + "\nnombre: " + nombre +"\nsaldo: " + saldo ;
    }
    
}
