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
public class concesionaria {
    
    private ArrayList<clientes> clients = new ArrayList();
    private ArrayList<vehiculos> v = new ArrayList();
    private String nombre;
    private int id;
    private String direccion;
    private double saldo;
    
    public concesionaria() {
    }

    public concesionaria(String nombre, int id, String direccion, double saldo) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public ArrayList<clientes> getClients() {
        return clients;
    }

    public void setClients(ArrayList<clientes> clients) {
        this.clients = clients;
    }

    public ArrayList<vehiculos> getV() {
        return v;
    }

    public void setV(ArrayList<vehiculos> v) {
        this.v = v;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "--concesionaria--"
                +"\nNombre: "+nombre+
                "\nID: " + id + "\nDireccion: " + direccion + "\nSaldo: " + saldo;
    }
    
}
