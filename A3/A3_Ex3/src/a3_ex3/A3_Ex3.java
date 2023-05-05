/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a3_ex3;

/**
 *
 * @author Alberto
 */
public class A3_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valor1 = 121;
        double valor2 = 11;
        double valor3 = 5.5;
        double valor4 = 2;
        
        System.out.println("Soma de 121 com 2: " + Calculadora.Soma(valor4, valor1));
        System.out.println("Subtracao de 5.5 de 2: " + Calculadora.Sub(valor3, valor4));
        System.out.println("Multiplicacao de 121 por 2: " + Calculadora.Mult(valor1, valor4));
        System.out.println("Divisao de 121 por 11: " + Calculadora.Div(valor1, valor2));
        
    }
    
}
