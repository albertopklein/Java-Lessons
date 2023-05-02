/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;
import java.util.Scanner;
/**
 *
 * @author Alberto
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido pedido01 = new Pedido("Fulano");
        pedido01.inserirProduto("Meia", 15);
        pedido01.inserirProduto("calca", 40);
        pedido01.inserirProduto("tenis", 250);
        
//        System.out.println(pedido01.produtos);
//        System.out.println("Valor final do pedido: " + pedido01.valor);
        System.out.println(pedido01.detalhesDoPedido());
    
        Pedido pedido02 = new Pedido("Fulano");
        pedido02.inserirProduto("Camiseta", 100, 5);
        pedido02.inserirProduto("Gorro", 20);
        pedido02.inserirProduto("Casaco", 200);
        

        System.out.println(pedido02.detalhesDoPedido());
        
//        String nome = "Fulano";
//        if(nome.equals(pedido01.cliente))
//            System.out.println("eh igual");
//        else
//            System.out.println("Nao eh igual");
//        
//        if(pedido01.equals(pedido02))
//            System.out.println("eh igual");
//        else
//            System.out.println("Nao eh igual");
    }
    
}
