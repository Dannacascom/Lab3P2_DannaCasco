/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_dannacasco;

/**
 *
 * @author Danna Casco
 */
class camion extends vehiculos {
    private double volumen;
    private double altura;
    private boolean excavadora;

    public camion() {
    }

    public camion(double volumen, double altura, boolean excavadora, String color, String marca, String modelo, int año, double precio, int llantas) {
        super(color, marca, modelo, año, precio, llantas);
        this.volumen = volumen;
        this.altura = altura;
        this.excavadora = excavadora;
    }



    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isExcavadora() {
        return excavadora;
    }

    public void setExcavadora(boolean excavadora) {
        this.excavadora = excavadora;
    }

    @Override
    public String toString() {
        return "camion{" + "volumen=" + volumen + ", altura=" + altura + ", excavadora=" + excavadora + '}';
    }
    
}
