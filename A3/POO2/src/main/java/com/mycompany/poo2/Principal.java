/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo2;

/**
 *
 * @author Alberto
 */
public class Principal {
    
    public static void main(String[] args){
       Cliente cliente1 = new Cliente("Fulano", "03241560025", "Av Bento Gonçalves 777");
       ContaBancaria conta1 = new ContaBancaria(cliente1, TipoConta.CONTA_CORRENTE, 1000, 2500);
       System.out.println(conta1.toString());
//Impressora.imprimiString("TESTE 2");
//        Impressora imp = new Impressora();
//
//        imp.imprimiString("TESTE");
//
//        conta1.setNrConta(null);
    }
}
