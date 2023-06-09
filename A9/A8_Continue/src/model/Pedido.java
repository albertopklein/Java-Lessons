/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import util.contador;

/**
 *
 * @author Alberto
 */
public class Pedido {

    public enum Status{
        AGUARDANDO,
        EM_ANDAMENTO,
        EM_TRANSITO,
        CANCELADO,
        FINALIZADO
    };

    private Integer id;
    private List<Item> itens;
    private LocalDateTime data;
    private Status status;
    private Cliente cliente;

    public Pedido(List<Item> itens, LocalDateTime data, Cliente cliente){
        this.id = contador.pegarID();
        this.itens = itens;
        this.data = data;
        this.status = Status.AGUARDANDO;
        this.cliente = cliente;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return id +
                " - " + itens +
                " - " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) +
                " - Valor Total=" + this.totalPedido();
    }

    private double totalPedido(){
        double total = 0;
        for(Item item: this.itens){
            total += item.getValor();
        }
        return total;
    }
}
