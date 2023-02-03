/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_dannacasco;

/**
 *
 * @author Danna Casco
 */
class vehiculos {
    protected String color;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precio;
    protected int llantas;

    public vehiculos() {
    }

    public vehiculos(String color, String marca, String modelo, int año, double precio, int llantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    @Override
    public String toString() {
        return "vehiculos{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", precio=" + precio + ", llantas=" + llantas + '}';
    }
    
}
