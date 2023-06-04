/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a8_ex1;

import java.util.Scanner;
import model.Cliente;
import service.ClienteService;

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
        
        
        do{
        System.out.println("--- BEM VINDO! ---");
        
        System.out.println("Digite seu CPF: ");
                
        String cpf = sc.next();
        
        // camada de servico vai conferir cpf e validar se ja existe
        Cliente cliente = clienteService.buscarCpf(cpf);
        }while(true);
        
    }
    
}
