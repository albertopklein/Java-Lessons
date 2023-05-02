/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a2_ex2;

/**
 *
 * @author Alberto
 */
public class Aluno {
    String nome;
    double notas[];
    int nNota;
    double minNota;
    double maxNota;
    double medNota;
    
    public Aluno(String nome){
        this.nome = nome;
        this.notas = new double[100];
        this.nNota = 0;
        this.minNota = 0;
        this.maxNota = 0;
        this.medNota = 0;
    }
    
    public void addNota(double nota){
        if(this.nNota < 100){
            this.notas[nNota] = nota;
            
            if(this.minNota > nota || nNota == 0){
                this.minNota = nota;
            }
            
            if(this.maxNota < nota){
                this.maxNota = nota;
            }
            this.nNota++;
        }
        else
            System.out.println("Excedeu número de notas do aluno: "+ this.nome);
    }
    
    public double getMedia(){
        double aux = 0;
        for(int i = 0; i < this.nNota; i++){
            aux += this.notas[i]; 
        }
        return (aux/nNota);
    }
    
    public String gerAlunoInfo(){
        return "Nome do Aluno: " + this.nome + "\n" +
                " Média do aluno: " + getMedia()+ "\n" +
                " Nota mais baixa: " + this.minNota + "\n" + 
                " Nota mais alta: " + this.maxNota + "\n";
    }
}
