/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lojabancodedados;

import lojabancodedados.model.Setor;
import repository.SetorRepository;

/**
 *
 * @author Alberto
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Setor setor = new Setor();
        setor.setNome("Informatica");
        setor.setAndar(2);
        
        SetorRepository setorRepository = new SetorRepository();
        System.out.println("Antes da inserção ");
        System.out.println(setor);
        setor = setorRepository.inserir(setor);
        System.out.println("Depois da inserção ");
        System.out.println(setor);
    }
    
}
