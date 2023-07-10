/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lojabancodedados;

import java.util.List;
import lojabancodedados.model.Produto;
import lojabancodedados.model.Setor;
import repository.ProdutoRepository;
import repository.SetorRepository;
import java.sql.*;
import java.util.ArrayList;

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
        ProdutoRepository produtoRepository = new ProdutoRepository();
        
        System.out.println("Antes da inserção ");
        System.out.println(setor);
        setor = setorRepository.inserir(setor);
        System.out.println("Depois da inserção ");
        System.out.println(setor);

        
       
        List<Setor> setores = setorRepository.buscarTodos();
        setores.forEach(System.out::println);
        /*
        for(Setor setor_num : setores){
            Setor s1 = setorRepository.buscarPorID(setor_num.getId());
            System.out.println(s1);
            s1.setNome("Padaria");
            s1.setAndar(5);
            s1 = setorRepository.atualizar(s1);
            System.out.println(s1);
        }
        /*
        for(Setor setor_num : setores){
            System.out.println(setor_num);
            setorRepository.excluir(setor_num.getId());
        }
        */    
        Produto produto = new Produto("SSD", 12124123, 12.5, setor);
        produto = produtoRepository.inserir(produto);
        
        
        List<Produto> produtos = produtoRepository.buscarTodos();
        
        //produtos.forEach(System.out::println);
        /*
        for(Produto produtos_n : produtos){
            Produto p1 = produtoRepository.buscarPorID(produtos_n.getId());
            System.out.println(p1);
            p1.setNome("Pao");
            p1.setCodigoDeBarras(51233124);
            p1.setValor(15.2);
            //p1.setSetor(setor);
            p1 = produtoRepository.atualizar(p1);
            System.out.println(p1);
        }
        /*
        for(Produto prod : produtos){
            System.out.println(prod);
            produtoRepository.excluir(prod.getId());
        }
        */
        
    }
    
}
