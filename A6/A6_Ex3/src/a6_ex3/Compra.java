/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a6_ex3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alberto
 */
public class Compra {
    private String descricao;
    private LocalDate dataCompra;
    
    public Compra(String descricao, LocalDate dataCompra){
        this.descricao = descricao;
        this.dataCompra = dataCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }
    
    @Override
    public String toString() {
        return "Compra{" + "descricao=" + descricao + ", dataCompra=" + dataCompra.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + '}';
    }
}
