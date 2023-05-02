/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2_ex1;

/**
 *
 * @author Alberto
 */
public class Jogador {
    String nome;
    int gols = 0;
    int assist = 0;
    
    public Jogador(String nome){
        this.gols = 0;
        this.assist = 0;
        this.nome = nome;
    }
    
    public void addGol(int gol){
        this.gols += gol;
    }
    
    public void addAssist(int assist){
        this.assist += assist;
    }
    
    public int getGols(){
        return this.gols;
    }
    
    public int getAssist(){
        return this.assist;
    }
}
