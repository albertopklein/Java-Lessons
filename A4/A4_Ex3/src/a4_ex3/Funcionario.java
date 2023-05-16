/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4_ex3;

/**
 *
 * @author Alberto
 */
public abstract class Funcionario {
    protected String nome;
    protected double   valorHora;
    protected double totalHoras;
    
    public Funcionario(String nome, double valorHora, double totalHoras){
        this.nome = nome;
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
        
    }
    
    public abstract double valorTotalAReceber();

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", valorHora=" + valorHora + ", totalHoras=" + totalHoras +", valor a receber= " + this.valorTotalAReceber() + '}';
    }
    
    
}
