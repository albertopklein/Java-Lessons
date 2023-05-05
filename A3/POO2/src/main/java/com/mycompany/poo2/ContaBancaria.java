/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo2;
import java.util.Random;
/**
 *
 * @author Alberto
 */

// Se uma conta bancária precisa de um cliente para existir, logo ela não pode existir sem um cliente;
public class ContaBancaria {
    private Cliente cliente;
    private Double saldo;
    private Double limiteChequeEspecial;
    private Integer agencia;
    private Long nrConta;
    private TipoConta tipo;
    
    public ContaBancaria(Cliente cliente, TipoConta tipo, double limiteChequeEspecial, double saldo){
        this.cliente = cliente; 
        this.tipo = tipo;
        this.limiteChequeEspecial = limiteChequeEspecial;
        
        this.nrConta = new Random().nextLong();
        this.agencia = new Random().nextInt();
        
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "cliente=" + cliente + "\n saldo=" + saldo + "\n limiteChequeEspecial=" + limiteChequeEspecial + "\n agencia=" + agencia + "\n nrConta=" + nrConta + "\n tipo=" + tipo + '}';
    }
    
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Long getNrConta(){
        return this.nrConta;
    }
    public void setNrConta(Long nrConta){
        this.nrConta = nrConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }
    
}
