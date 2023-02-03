/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_dannacasco;

/**
 *
 * @author Danna Casco
 */
public class moticicleta extends vehiculos{
    private String desmotor;
    private boolean electrica;
    
    public moticicleta() {
    }

    public moticicleta(String desmotor, boolean electrica, String color, String marca, String modelo, int año, double precio, int llantas) {
        super(color, marca, modelo, año, precio, llantas);
        this.desmotor = desmotor;
        this.electrica = electrica;
    }

    public String getDesmotor() {
        return desmotor;
    }

    public void setDesmotor(String desmotor) {
        this.desmotor = desmotor;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return "moticicleta{" + "desmotor=" + desmotor + ", electrica=" + electrica + '}';
    }
    
    
    
}
