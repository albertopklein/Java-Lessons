/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Alberto
 */
public class Pedido {
    
    private Integer id;
    
    public enum Status{
        AGUARDANDO,
        EM_ANDAMENTO,
        EM_TRANSITO,
        CANCELADO,
        FINALIZADO
    };
    private List<Item> itens;
    
    private LocalDate data;
    
    private Status status;
}
