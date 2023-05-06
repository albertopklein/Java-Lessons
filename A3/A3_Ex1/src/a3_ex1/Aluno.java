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
    private double[] notas = new double[3];
    private int nNotas;
    
    public Aluno(String nome,String matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.nNotas = 0;

    }
    
    private double sumNotasCheck(double nota){
        double aux = 0;
        for(int i = 0; i < nNotas; i++){
            aux += notas[i];
        }
        return aux+nota;
    }
    
    public void addNota(double nota){
        if(nota >= 0 && nota <= 100 && nNotas < 3 && sumNotasCheck(nota) < 100){
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
        double minNotas = notas[0];
        for(int i = 1; i < notas.length; i++){
            if(notas[i] < minNotas)
                minNotas = notas[i];
        }
        System.out.println("MinNota= " + minNotas);
        return minNotas;
    }
    
    public double getMaxNota(){
        double maxNotas = notas[0];
        for(int i = 1; i < notas.length; i++){
            if(notas[i] > maxNotas)
                maxNotas = notas[i];
        }
        System.out.println("MaxNotas= " + maxNotas);
        return maxNotas;
    }
}
