/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo4;

/**
 *
 * @author Alberto
 */
public class Retangulo implements Forma{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public double calculaArea() {
        return altura*largura;
    }
    
    
}
