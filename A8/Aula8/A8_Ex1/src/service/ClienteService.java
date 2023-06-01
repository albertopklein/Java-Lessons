/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Cliente;
import repositories.ClienteRepository;
import java.util.*;
/**
 *
 * @author Alberto
 */
public class ClienteService {
    
    private static ClienteService service;
    
    private ClienteRepository repository;
    
    private static Scanner sc;
    
    private ClienteService(){
        this.repository = new ClienteRepository(); 
    }
    
    public static ClienteService getInstance(Scanner sc){
        if(service == null){
            service = new ClienteService();
            ClienteService.sc = sc;
        }
        
        return service;
    }
    
    public Cliente buscarCpf(String cpf){
        Cliente cliente = this.repository.BuscarPorCpf(cpf);
        
        if(cliente == null){
            sc.next();
            System.out.println("Digite seu nome: ");
            String nome = ClienteService.sc.nextLine();
            System.out.println("Digite seu endereço: ");
            String endereco = ClienteService.sc.nextLine();
            System.out.println("Digite seu telefone: ");
            String telefone = ClienteService.sc.nextLine();
            
            cliente = new Cliente(nome, cpf, telefone, endereco);
            
            repository.salvar(cliente);
        }
        return cliente;
    }
}
