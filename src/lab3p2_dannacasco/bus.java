/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_dannacasco;

/**
 *
 * @author Danna Casco
 */
class bus extends vehiculos {
    private int pasajeros;
    private String tipo;

    public bus() {
    }

    public bus(int pasajeros, String tipo, String color, String marca, String modelo, int año, double precio, int llantas) {
        super(color, marca, modelo, año, precio, llantas);
        this.pasajeros = pasajeros;
        this.tipo = tipo;
    }
    
 

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int pasajeros ){
        if(pasajeros <= 50 ){
            tipo = "rapidito";
        }else{
            tipo ="bus de ruta";
        }
    }

    @Override
    public String toString() {
        return "bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
    }
    
    
}
