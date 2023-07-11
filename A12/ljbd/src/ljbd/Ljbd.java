/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ljbd;
import java.util.List;
import java.util.Scanner;

import ljbd.model.Produto;
import ljbd.model.Setor;
import ljbd.repository.ProdutoRepository;
import ljbd.repository.SetorRepository;

/**
 *
 * @author Alberto
 */
public class Ljbd {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			SetorRepository setorRepository = new SetorRepository();
			ProdutoRepository produtoRepository = new ProdutoRepository();
			
			do {
				System.out.println("===============================");
				System.out.println("BEM VINDO!");
				System.out.println("0 - Para encerrar o programa");
				System.out.println("1 - Inserir setor");
				System.out.println("2 - Inserir produto");
				int opcao = sc.nextInt();
				if(opcao == 1) {
					sc.nextLine();
					
					System.out.println("Digite o nome do setor: ");
					String nome = sc.nextLine();
					System.out.println("Digite o andar do setor: ");
					int andar = sc.nextInt();
					
					Setor setor = new Setor(null, nome, andar);					
					setorRepository.inserir(setor);
				}else if(opcao == 2) {
					sc.nextLine();
					
					System.out.println("Digite o nome do produto: ");
					String nome = sc.nextLine();
					
					System.out.println("Digite o codigo do produto: ");
					Long codDeBarras = sc.nextLong();
					
					System.out.println("Digite o valor do produto: ");
					Double valor = sc.nextDouble();
					
					
					System.out.println("Escolha o setor do produto: ");
					List<Setor> setores = setorRepository.buscarTodos();
					setores.forEach(System.out::println);
					
					int setorSelecionado = sc.nextInt();
					
					Setor setor = setorRepository.buscarPorId(setorSelecionado);
					
					Produto produto = new Produto(null, nome, codDeBarras, valor, setor);
					
					produto = produtoRepository.inserir(produto);
					
				}else if(opcao == 0) {
					break;
				}else if (opcao == 3){
                                    List<Produto> produtos = produtoRepository.buscarTodos();
                                    produtos.forEach(System.out::println);
                                }
				else {
					System.out.println("Opção inválida");
				}
			}while(true);
		
	}

}
