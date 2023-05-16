/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a4_ex3;

/**
 *
 * @author Alberto
 */
public class A4_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Programador("Joao", 1, 1000);
        Funcionario f2 = new Contador("Fulano", 1, 1000);
        Funcionario f3 = new Administrador("Abuelo", 1, 1000);
    
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        
    }
    
}
