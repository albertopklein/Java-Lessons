/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2_ex1;

/**
 *
 * @author Alberto
 */
public class A2_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Cafu");
        Jogador jogador02 = new Jogador("Pele");
        
        jogador01.addGol(3);
        jogador01.addAssist(5);
        
        jogador02.addGol(1);
        jogador02.addAssist(2);
        
        System.out.println("O Jogador "+ jogador01.nome + " fez " + jogador01.getAssist() + " assistencias e fez " + jogador01.getGols() + " gols.");
        System.out.println("O Jogador "+ jogador02.nome + " fez " + jogador02.getAssist() + " assistencias e fez " + jogador02.getGols() + " gols.");
        
        int x = 10;
        int y = 10;
        System.out.println("inicial " + x);
        x += x;
        System.out.println("x+= x " + x);
        x += y;
        System.out.println("x += y " + x);
        x /= y;
        System.out.println("x/= y " + x);
        ++x;
        System.out.println("++x " + x);
        x++;
        System.out.println("x++" + x);
    }
    
}
