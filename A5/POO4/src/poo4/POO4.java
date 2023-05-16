/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo4;

import java.util.InputMismatchException;
import java.util.Scanner;
import poo4.exceptions.TestException;

/**
 *
 * @author Alberto
 */
public class POO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(1 , 5);
        
        Forma circulo = new Circulo(10);
        
        System.out.println(retangulo.calculaArea());
        
        System.out.println(circulo.calculaArea());
        boolean cond = true;
        while(cond)
        try{
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número inteiro: ");
            int inputUser = sc.nextInt();
            System.out.println("Fim do código!");
            cond = false;
        }catch(InputMismatchException exception){
            
            System.out.println("Voce colocou uma opcao invalida!" + exception.getMessage());
            System.out.println("Tente novamente!");
            exception.printStackTrace();
            //lancaExcecao();
        }
    }
    
    public static void lancaExcecao() throws TestException{
        if(1 == 1){
            throw new TestException("Excecao Teste!  ");
        }
    }
}
