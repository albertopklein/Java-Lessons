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
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SetorRepository setorRepository = new SetorRepository();
        ProdutoRepository produtoRepository = new ProdutoRepository();
        
        do{
            System.out.println("=========================");
            System.out.println("BEM VINDO!");
            System.out.println("0 - Para encerrar o programa");
            System.out.println("1 - Inserir setor");
            System.out.println("2 - Inserir produto");
            System.out.println("3 - Alterar setor");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Excluir setor");
            System.out.println("6 - Excluir produto");
            System.out.println("7 - Listar todos os setores");
            System.out.println("8 - Listar todos os produtos");
            
            int op = sc.nextInt();
            if(op == 1){
                
                sc.nextLine();
                
                System.out.println("Digite o nome do setor: ");
                String nome = sc.nextLine();
                System.out.println("Digite o andar do setor: ");
                int andar = sc.nextInt();
                Setor setor = new Setor(null, nome, andar);

                setorRepository.inserir(setor);
            } else if(op == 2){
                sc.nextLine();
                
                System.out.println("Digite o nome do produto: ");
                String nome = sc.nextLine();
                System.out.println("Digite o codigo de barras do produto: ");
                long codigoDeBarras = sc.nextLong();
                System.out.println("Digite o valor do produto: ");
                double valor = sc.nextDouble();
                System.out.println("Escolha qual setor alocar este produto: ");
                List<Setor> setores = setorRepository.buscarTodos();
                setores.forEach(System.out::println);
                int setor_id = sc.nextInt();
                
                Setor setor = setorRepository.buscarPorID(setor_id);
                
                Produto produto = new Produto(null, nome, codigoDeBarras, valor, setor);
                
                produto = produtoRepository.inserir(produto);
                
                
            } else if(op == 3){
                System.out.println("Escolha uma opção abaixo: ");
                List<Setor> setores = setorRepository.buscarTodos();
                setores.forEach(System.out::println);
                int id_sel = sc.nextInt();
                Setor setor = setorRepository.buscarPorID(id_sel);
                sc.nextLine();
                
                System.out.println("Digite nome do setor: ");
                String nome = sc.nextLine();
                System.out.println("Digite o andar do setor: ");
                int andar = sc.nextInt();
                
                setor.setNome(nome);
                setor.setAndar(andar);
                
                setorRepository.atualizar(setor);
                
            } else if(op == 4){
                System.out.println("Escolha uma opção abaixo");
                List<Produto> produtos = produtoRepository.buscarTodos();
                produtos.forEach(System.out::println);
                
                int id_sel = sc.nextInt();
                
                Produto produto = produtoRepository.buscarPorID(id_sel);
                
                sc.nextLine();
                
                System.out.println("Digite o nome do produto: ");
                String nome = sc.nextLine();
                System.out.println("Digite o codigo de barras do produto: ");
                long codigoDeBarras = sc.nextLong();
                System.out.println("Digite o valor do produto: ");
                double valor = sc.nextDouble();
                System.out.println("Escolha qual setor alocar este produto: ");
                List<Setor> setores = setorRepository.buscarTodos();
                setores.forEach(System.out::println);
                int setor_id = sc.nextInt();
                Setor setor = setorRepository.buscarPorID(setor_id);
                
                produto.setNome(nome);
                produto.setCodigoDeBarras(codigoDeBarras);
                produto.setValor(valor);
                produto.setSetor(setor);
                
                produtoRepository.atualizar(produto); 
                
            } else if(op == 5){
                System.out.println("Escolha uma opção abaixo: ");
                List<Setor> setores = setorRepository.buscarTodos();
                setores.forEach(System.out::println);
                int id_sel;
                do{
                    id_sel = sc.nextInt();
                    System.out.println("Tem certeza que deseja deletar o setor: " + id_sel);
                    String confirma = sc.next();    
                    
                    if(confirma.contains("S")) break;
                    System.out.println("Digite o código novamente: ");
                } while(true);
                
                setorRepository.excluir(id_sel);
            } else if(op == 6){
                System.out.println("Escolha uma opção abaixo");
                List<Produto> produtos = produtoRepository.buscarTodos();
                produtos.forEach(System.out::println);
                int id_sel;
                do{
                    id_sel = sc.nextInt();
                    System.out.println("Tem certeza que deseja deletar o produto: " + id_sel);
                    String confirma = sc.next();
                    
                    if(confirma.contains("S")) break;
                    System.out.println("Digite o código novamente: ");
                    
                }while(true);
                produtoRepository.excluir(id_sel);
            
            } else if(op == 7){
                List<Setor> setores = setorRepository.buscarTodos();
                setores.forEach(System.out::println);
            } else if(op == 8){
                List<Produto> produtos = produtoRepository.buscarTodos();
                produtos.forEach(System.out::println);
            } else if(op == 0){
                break;
            }else System.out.println("Opção Inválida!");
        } while(true);
        
        
        
        /*
        Testes:
        Setor setor = new Setor(null, "Informatica", 2);
               
        System.out.println("Antes da inserção ");
        System.out.println(setor);
        setor = setorRepository.inserir(setor);
        System.out.println("Depois da inserção ");
        System.out.println(setor);

        List<Setor> setores = setorRepository.buscarTodos();
        setores.forEach(System.out::println);
        
        for(Setor setor_num : setores){
            Setor s1 = setorRepository.buscarPorID(setor_num.getId());
            System.out.println(s1);
            s1.setNome("Padaria");
            s1.setAndar(5);
            s1 = setorRepository.atualizar(s1);
            System.out.println(s1);
        }
        
        for(Setor setor_num : setores){
            System.out.println(setor_num);
            setorRepository.excluir(setor_num.getId());
        }
           
        Produto produto = new Produto(null, "SSD", 12124123, 12.5, setor);
        produto = produtoRepository.inserir(produto);
        
        List<Produto> produtos = produtoRepository.buscarTodos();
        
        //produtos.forEach(System.out::println);
        
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
        
        for(Produto prod : produtos){
            System.out.println(prod);
            produtoRepository.excluir(prod.getId());
        }
        
        */
    }
    
}
