/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4_ex3;

/**
 *
 * @author Alberto
 */
public class Administrador extends Funcionario {
    private final double BONUS = 0.06;
    
    public Administrador(String nome, double valorHora, double totalHoras){
        super(nome, valorHora, totalHoras);
    }

    @Override
    public double valorTotalAReceber() {
        return ((valorHora*totalHoras)*(1+BONUS));
    }
}
