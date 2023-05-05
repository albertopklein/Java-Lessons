/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a3_ex2;

/**
 *
 * @author Alberto
 */
public class A3_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pedido p1 = new Pedido("Fulano");
        p1.addItens("Coca Cola topzera", 10);
        p1.addItens(null, 10); // Teste string invalida
        p1.addItens("Camiseta", -1); // Teste valor negativo
        p1.addItens("Tenis", 100); //teste add normal
        p1.addItens("Capacete", 252); // teste add normal
        System.out.println("Status do Pedido: " + p1.getStat());
        p1.setStat(Status.FATURADO);
        System.out.println("Status do Pedido: " + p1.getStat());
        p1.setStat(Status.AGUARDANDO_TRANSP);
        System.out.println("Status do Pedido: " + p1.getStat());
        p1.setStat(Status.CONCLUIDO);
        System.out.println(p1.getItens() + "\n" + "Valor Total a pagar: " + p1.getValor_Total() + "\n" + "Status do Pedido: " + p1.getStat());
        
    }
    
}
