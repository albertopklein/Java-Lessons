/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2_ex2;

/**
 *
 * @author Alberto
 */
public class A2_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Cafu");
        Aluno aluno02 = new Aluno("Pele");
        
        aluno01.addNota(5.5);
        aluno01.addNota(3.5);
        aluno01.addNota(9);
        aluno01.addNota(8);
        aluno01.addNota(8.5);
        
        for(int i = 0; i < 101; i++ ){
            aluno02.addNota(i+1);
        }
        
        System.out.println(aluno01.gerAlunoInfo());
        System.out.println(aluno02.gerAlunoInfo());
    }
    
}
