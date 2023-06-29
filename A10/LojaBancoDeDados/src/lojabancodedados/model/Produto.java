/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojabancodedados.model;

/**
 *
 * @author Alberto
 */
public class Produto {
    private Integer id;
    private String nome;
    private long codigoDeBarras;
    private double valor;
    private Setor setor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(long codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    
    
}
