/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Cliente;
import model.Item;
import model.Pedido;
import repositories.PedidoRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class PedidoService {
    private static PedidoService service;
    private static Scanner sc;
    private PedidoRepository repository;
    private PedidoService(){
        this.repository = new PedidoRepository();
    }

    public static PedidoService getInstance(Scanner sc){
        if(service == null){
            service = new PedidoService();
            PedidoService.sc = sc;
        }
        return service;
    }

    public Pedido criarPedido(List<Item> itens, Cliente cliente){
        Pedido pedido = new Pedido(itens, LocalDateTime.now(), cliente);
        repository.salvar(pedido);
        return pedido;
    }
    public Pedido criarPedido(List<Item> itens, Cliente cliente, String dataString){
        LocalDateTime data = LocalDateTime.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        Pedido pedido = new Pedido(itens, data, cliente);
        repository.salvar(pedido);
        return pedido;
    }

    public void verPedidoPorCliente(Cliente cliente){
        List<Pedido> pedidoDoCliente = this.repository.buscarPorCliente(cliente);

        pedidoDoCliente.forEach(pedido -> System.out.println(pedido));
    }
}
