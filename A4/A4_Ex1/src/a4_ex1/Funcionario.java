/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4_ex1;

/**
 *
 * @author Alberto
 */
public class Funcionario {
    private String nome;
    private String func;
    private String cargo;
    
    public Funcionario(String nome, String func, String cargo){
        this.nome = nome;
        this.func = func;
        this.cargo = cargo;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", func=" + func + ", cargo=" + cargo + '}';
    }
    
    
}
