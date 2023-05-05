/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a3_ex1;

/**
 *
 * @author Alberto
 */
public class A3_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Cafu", "1112312412");
        Aluno aluno02 = new Aluno("Pele", "1341251231");
        
        aluno01.addNota(55.5);
        aluno01.addNota(3.5);
        aluno01.addNota(98);
        aluno01.addNota(8);
        aluno01.addNota(8.5);
        
        for(int i = 0; i < 4; i++ ){
            aluno02.addNota(i+1);
        }
        
        System.out.println(aluno01.gerAlunoInfo());
        System.out.println(aluno02.gerAlunoInfo());
        
        
    }
    
}
