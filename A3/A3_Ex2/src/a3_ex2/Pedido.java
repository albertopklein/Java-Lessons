/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3_ex2;

/**
 *
 * @author Alberto
 */
public class Pedido {
    private String[] Itens;
    private Status stat;
    private double Valor_Total;
    private String Cliente;
    
    public Pedido(String Cliente){
        this.Itens = new String[10];
        this.stat = Status.AGUARDANDO_PAGAMENTO;
        this.Valor_Total = 0;
        this.Cliente = Cliente;
    }
    public String getItens(){
        String aux = "";
        for(int i = 0; i < 10; i++){
            aux += this.Itens[i] + ";";
        }
        return aux.toUpperCase();
    }
    public void addItens(String Item, double valor) {
        if(Item != null && valor > 0){
            for(int i = 0; i < 10; i++){
                if(this.Itens[i] == null){
                    this.Itens[i] = Item;
                    this.Valor_Total += valor;
                    return;
                }
            }
            System.out.println("Excedeu numero de itens no pedido!");
        }
        else if(valor < 0){
            System.out.println("Valor menor que zero!");
        }
        else if(Item == null){
            System.out.println("Nenhum item adicionado (String invalida)");
        }
        else{
            System.out.println("Op invalida!");
        }
    }

    public String getStat() {
        if(stat == Status.CONCLUIDO){
            return "Concluido";
        }
        else if(stat == Status.FATURADO)
            return "Faturado!";
        else if(stat == Status.AGUARDANDO_PAGAMENTO)
            return "Aguardando Pagamento!";
        else if(stat == Status.AGUARDANDO_TRANSP)
            return "Aguardando Transporte!";
        else
            return "Transito";
    }

    public void setStat(Status stat) {
        this.stat = stat;
    }

    public double getValor_Total() {
        return Valor_Total;
    }

    public void setValor_Total(double Valor_Total) {
        this.Valor_Total = Valor_Total;
    }
    
    
}
