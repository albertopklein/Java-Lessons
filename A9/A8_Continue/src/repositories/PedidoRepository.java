/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;


import model.Cliente;
import model.Pedido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.*;
/**
 *
 * @author Alberto
 */
public class PedidoRepository implements BancoDeDados<Pedido> {

    Map<Integer, Pedido> repository = new HashMap<>();
    @Override
    public Pedido salvar(Pedido pedido) {
        this.repository.put(pedido.getId(), pedido);
        return pedido;
    }

    @Override
    public Pedido buscarId(Integer id) {
        return this.buscarTodos().stream().filter(pedido -> pedido.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Pedido> buscarTodos() {
        return new ArrayList<>(repository.values());
    }

    @Override
    public void deletarPorId(Integer id) {
        this.repository.remove(id);
    }

    public List<Pedido> buscarPorCliente(Cliente cliente) {
        return this.buscarTodos().stream()
                .filter(pedido -> pedido.getCliente().equals(cliente))
                .collect(Collectors.toList());
    }
}
