/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14;

/**
 *
 * @author Alberto
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Fulano", 1, "fulano@fulano.com", 0);
        Aluno aluno2 = new Aluno("Fulano", 1, "fulano@fulano.com", 0);
        
        if(aluno.equals(aluno2)){
            System.out.println("Igual!");
        } else{
            System.out.println("Diferente!");
        }
    }
    
}
