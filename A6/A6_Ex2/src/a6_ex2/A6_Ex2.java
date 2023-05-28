/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a6_ex2;

import java.util.*;

/**
 *
 * @author Alberto
 */
public class A6_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Long,Aluno> mapaAlunos = new TreeMap<>();
        System.out.println(mapaAlunos);
        Scanner sc = new Scanner(System.in);
        
        boolean continua = true;
        do{
            System.out.println("Bem vindo ao cadastro de alunos!");
            System.out.println("Digite 1 para adicionar aluno");
            System.out.println("Digite 2 para remover aluno");
            System.out.println("Digite 3 para ver Alunos matriculados");
            System.out.println("Digite 0 para sair do sistema");
            int opUser = sc.nextInt();
            switch(opUser){
                case 1:
                    System.out.println("Digite a matricula do Aluno: ");
                    long matricula = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Digite o nome do Aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o e-mail do Aluno: ");
                    String email = sc.nextLine();
                    mapaAlunos.put(matricula, new Aluno(nome, email));
                    break;
                case 2:
                    System.out.println("Digite a matricula do Aluno: ");
                    long matriculaRemover = sc.nextLong();
                    Aluno alunoRemover = mapaAlunos.get(matriculaRemover);
                    System.out.println("Você está removendo o aluno: " + alunoRemover.getNome());
                    mapaAlunos.remove(matriculaRemover);
                    System.out.println("Aluno removido com sucesso! ");
                    break;
                case 3:
                    System.out.println(mapaAlunos);
                    break;
                case 0:
                    continua = false;
                    System.out.println("Saindo do sistema! ");
                    break;
            }
            
        } while(continua);
    }
    
}
