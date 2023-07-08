
import escola.Aluno;
import repository.BancoDeDados;
import java.sql.Connection;
import java.util.List;
import repository.AlunosRepository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alberto
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Jose");
        Aluno a2 = new Aluno("Joao");
        Aluno a3 = new Aluno("Ze");
        Aluno a4 = new Aluno("Maria");
        AlunosRepository alunosRepository = new AlunosRepository();
        System.out.println("Antes da inserção ");
        System.out.println(a1);
        a1 = alunosRepository.inserir(a1);
        System.out.println("Depois da inserção ");
        System.out.println(a1);
        a2 = alunosRepository.inserir(a2);
        a3 = alunosRepository.inserir(a3);
        a4 = alunosRepository.inserir(a4);
        alunosRepository.updateNome(a2.getId(), "Gremio");
        alunosRepository.updateNome(a3.getId(), "Inter");
        alunosRepository.updateNome(a4.getId(), "Brasil de Pelotas");
        alunosRepository.updateNome(a1.getId(), "Lajeadense");


        List<Aluno> listaAlunos = alunosRepository.buscarTodos();
        System.out.println(listaAlunos);
        
        //Aluno a5 = alunosRepository.buscarPorID(2);
        //System.out.println(a5);

        for (Aluno aluno : listaAlunos) { 
            alunosRepository.excluir(aluno.getId());
        }
        listaAlunos = alunosRepository.buscarTodos();
        System.out.println("Tamanho do BD: " + listaAlunos.size());
    }
    
}
