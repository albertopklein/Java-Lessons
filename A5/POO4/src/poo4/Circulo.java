/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo4;

/**
 *
 * @author Alberto
 */
public class Circulo implements Forma {
    private double circunferencia;

    
    public Circulo(double circunferencia){
        this.circunferencia = circunferencia;
    }
    
    @Override
    public double calculaArea() {
        double raio = this.circunferencia / (2*Math.PI);
        return Math.PI * raio * raio;
    }
    
    
}
