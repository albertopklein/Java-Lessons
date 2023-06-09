/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a8_ex1;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Cliente;
import model.Item;
import model.Pedido;
import service.ClienteService;
import service.ItemService;
import service.PedidoService;
/**
 *
 * @author Alberto
 */
public class A8_Ex1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClienteService clienteService = ClienteService.getInstance(sc);
        ItemService itemService = ItemService.getInstance(sc);
        PedidoService pedidoService = PedidoService.getInstance(sc);

        do{
            System.out.println("--- BEM VINDO! ---");
            System.out.println("Digite seu CPF: ");
            //sc.next();
            String cpf = sc.nextLine(); // had to change to nextLine because it had issues in Mac OS X

            // camada de servico vai conferir cpf e validar se ja existe

            Cliente cliente;
            try {
                cliente = clienteService.buscarPorCpf(cpf);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("Bem vindo, " + cliente.getNome());

            System.out.println("ESCOLHA UMA OPÇÃO: ");
            System.out.println("1 - REALIZAR UM PEDIDO");
            System.out.println("2 - VER PEDIDOS REALIZADOS");
            //sc.next();
            int opcaoUsuario = sc.nextInt();

            if(opcaoUsuario == 1) {
                System.out.println("-----------------------");
                System.out.println("Escolhe um item:");
                System.out.println("0 - PARA SAIR DA ESCOLHA DOS ITENS");
                itemService.mostrarTodosItens();
                System.out.println("-----------------------");

                List<Item> itensEscolhidos = new ArrayList<>();
                do {
                    int opcaoItem = sc.nextInt();
                    if(opcaoItem == 0) {
                        break;
                    }

                    itensEscolhidos.add(itemService.escolheItem(opcaoItem));

                }while(true);

                System.out.println("Você deseja agendar este pedido?");
                System.out.println("1 - SIM");
                System.out.println("2 - NÃO");

                int agendar = sc.nextInt();
                if(agendar == 1) {
                    System.out.println("Digite a data que você deseja: dd/mm/aaaa HH:mm");
                    sc.nextLine();
                    String dataAgendada = sc.nextLine();

                    pedidoService.criarPedido(itensEscolhidos, cliente, dataAgendada);
                }else {

                    pedidoService.criarPedido(itensEscolhidos, cliente);
                }
            }else if(opcaoUsuario == 2) {
                pedidoService.verPedidoPorCliente(cliente);
            }else {
                System.out.println("OPÇÃO INVALIDA!");
            }

        }while(true);

        }

}
