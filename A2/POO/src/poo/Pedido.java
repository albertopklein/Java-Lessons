/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Alberto
 */
public class Pedido {
    double valor;
    String produtos;
    int quantidade;
    String cliente;
    
    //Construtor
    public Pedido(String cliente){
        this.cliente = cliente;
        this.quantidade = 0;
    }
    //Métodos
    public void inserirProduto(String produto, double valor){ //(String cliente, String produtoParam, int quantidade, double valor){
        if(this.produtos == null)
                this.produtos = produto;
        else
            this.produtos += ", " + produto; 
        this.valor += valor;
        this.quantidade ++;
    }
    
    public void inserirProduto(String produto, double valor, int quantidade){        if(this.produtos == null)
        for(int i = 0; i<quantidade; i++){
            inserirProduto(produto, valor);
        }
    }
    
    public String detalhesDoPedido(){
        return "Cliente: " + cliente + "\n" + 
                "Produtos: " + produtos + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "Valor: " + valor + "\n";
                
    }
    
    public boolean equals(Pedido outro){
        return this.cliente.equals(outro.cliente) && this.produtos.equals(outro.produtos) 
                && this.quantidade == outro.quantidade && this.valor == outro.valor; 
    } 
}
