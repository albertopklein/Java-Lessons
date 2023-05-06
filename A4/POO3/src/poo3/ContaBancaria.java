/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo3;

/**
 *
 * @author Alberto
 */
public class ContaBancaria {
    protected String titular;
    protected double saldo;
    
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
}
