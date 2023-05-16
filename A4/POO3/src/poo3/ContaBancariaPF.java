/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo3;

/**
 *
 * @author Alberto
 */
public class ContaBancariaPF extends ContaBancaria {
    public ContaBancariaPF(String titular, double saldo){
        super(titular,saldo);
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("Olá titular: " + super.titular);
        System.out.println("Saldo: "+ super.saldo);
    }

    @Override
    public double sacar(double valorSaque) {
        if(saldo - 10 >= valorSaque){
            this.saldo -= (valorSaque + 10);
            return valorSaque; 
        }
        else {
            System.out.println("Saldo indisponível! Saldo atual é: " + this.saldo);
            return 0;
        }
    }
}
