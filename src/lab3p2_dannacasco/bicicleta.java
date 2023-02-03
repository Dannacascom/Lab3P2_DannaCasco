/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_dannacasco;

/**
 *
 * @author Danna Casco
 */
class bicicleta extends vehiculos{
    private String descripcion;
    private double radiorueda;
    private String tipo;

    public bicicleta() {
    }

    public bicicleta(String descripcion, double radiorueda, String tipo, String color, String marca, String modelo, int año, double precio, int llantas) {
        super(color, marca, modelo, año, precio, llantas);
        this.descripcion = descripcion;
        this.radiorueda = radiorueda;
        this.tipo = tipo;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getRadiorueda() {
        return radiorueda;
    }

    public void setRadiorueda(double radiorueda) {
        this.radiorueda = radiorueda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "bicicleta{" + "descripcion=" + descripcion + ", radiorueda=" + radiorueda + ", tipo=" + tipo + '}';
    }
    
    
}
