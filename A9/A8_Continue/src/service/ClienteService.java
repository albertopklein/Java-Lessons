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

    private boolean validaCpf(String cpf) {
        cpf = cpf.replace("-", "").replace(".", "");

        if(cpf.length() != 11) {
            return false;
        }

        boolean todoDigitosIguais = true;

        for(int i = 1; i < cpf.length(); i++) {
            if(cpf.charAt(i) != cpf.charAt(0)) {
                todoDigitosIguais = false;
                break;
            }
        }


        if(todoDigitosIguais) {
            return false;
        }


        // Validação dos dígitos verificadores
        int soma1 = 0;
        int soma2 = 0;

        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma1 += digito * (10 - i);
            soma2 += digito * (11 - i);
        }

        int digitoVerificador1 = (soma1 % 11 < 2) ? 0 : 11 - (soma1 % 11);
        soma2 += digitoVerificador1 * 2;
        int digitoVerificador2 = (soma2 % 11 < 2) ? 0 : 11 - (soma2 % 11);

        return digitoVerificador1 == Character.getNumericValue(cpf.charAt(9)) &&
                digitoVerificador2 == Character.getNumericValue(cpf.charAt(10));
    }

    public Cliente buscarPorCpf(String cpf) throws Exception {

        if(!validaCpf(cpf)) {
            throw new Exception("CPF Inválido");
        }

        Cliente cliente = this.repository.BuscarPorCpf(cpf);
        
        if(cliente == null){
            //sc.next(); // uncomment using Windows OS
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
