/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Cliente;

/**
 *
 * @author Alberto
 */
public class ClienteRepository implements BancoDeDados<Cliente> {
    Map<Integer, Cliente> repository = new HashMap<>();

    
    public Cliente BuscarPorCpf(String cpf){
        return this.buscarTodos().stream()
                .filter(cliente -> cliente.getCpf().equals(cpf))
                .findFirst().orElse(null);
    }
    
    @Override
    public Cliente salvar(Cliente cliente) {
        System.out.println(cliente);
        this.repository.put(cliente.getId(), cliente);
        return cliente;
    }

    @Override
    public Cliente buscarId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> buscarTodos() {
        return new ArrayList<>(this.repository.values());
    }

    @Override
    public void deletarPorId(Integer id) {
        this.repository.remove(id);
    }
    
    
    
}
