/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_dannacasco;

/**
 *
 * @author Danna Casco
 */
class carro extends vehiculos{
   private int puertas;
   private String motor;
   private double velocidad;

    public carro() {
       super();
    }

    public carro(int puertas, String motor, double velocidad, String color, String marca, String modelo, int año, double precio, int llantas) {
        super(color, marca, modelo, año, precio, llantas);
        this.puertas = puertas;
        this.motor = motor;
        this.velocidad = velocidad;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "carro{" + "puertas=" + puertas + ", motor=" + motor + ", velocidad=" + velocidad + '}';
    }

  
}
