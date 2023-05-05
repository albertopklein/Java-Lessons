/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a3_ex1;
/**
 *
 * @author Alberto
 */
public class Aluno {
    private String nome;
    private String matricula;
    private double notas[];
    private int nNotas;
    
    public Aluno(String nome,String matricula){
        this.nome = nome;
        this.notas = new double[3];
        this.matricula = matricula;
        this.nNotas = 0;
//        for(int i = 0; i < 3; i++){
//            this.notas[i]= -1;
//        }
    }
    
    private double sumNotas(double nota){
        double aux = 0;
        for(int i = 0; i < nNotas; i++){
            aux += notas[i];
        }
        return aux+nota;
    }
    
    public void addNota(double nota){
        if(nota >= 0 && nota <= 100 && nNotas < 3 && sumNotas(nota) < 100){
            this.notas[nNotas] = nota;
            this.nNotas++;
        }
        else if(nota < 0){
            System.out.println("Nota menor que 0 é inválida.");
        }
        else if(nNotas == 3){
            System.out.println("Excedeu número de notas do aluno: "+ this.nome + "\n");
        }
        else
            System.out.println("Excedeu a soma máxima (100) de notas do aluno: "+ this.nome + "\n" + "Adiciona outra nota novamente.");
    }
    
    public double getMedia(){
        double aux = 0;
        for(int i = 0; i < 3; i++){
            aux += this.notas[i]; 
        }
        return (aux/3);
    }
    
    public String gerAlunoInfo(){
        return "Nome do Aluno: " + this.nome + "\n" +
                "Matricula: " + this.matricula + "\n" + 
                "Media do aluno: " + getMedia()+ "\n" +
                "Nota mais baixa: " + this.getMinNota() + "\n" + 
                "Nota mais alta: " + this.getMaxNota() + "\n";
    }
    
    public double getMinNota(){
        if(notas[0] < notas[1] && notas[0] < notas[2]){
            return notas[0];
        }
        else if(notas[1] < notas[0] && notas[1] < notas[2]){
            return notas[1];
        }
        else{
            return notas[2];
        }
    }
    public double getMaxNota(){
        if(notas[0] > notas[1] && notas[0] > notas[2]){
            return notas[0];
        }
        else if(notas[1] > notas[0] && notas[1] > notas[2]){
            return notas[1];
        }
        else{
            return notas[2];
        }
    }
}
