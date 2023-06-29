/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojabancodedados.model;

/**
 *
 * @author Alberto
 */
public class Setor {

    private Integer id;
    private String nome;
    private Integer andar;
    
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

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }
    
     @Override
    public String toString() {
        return "Setor{" + "id=" + id + ", nome=" + nome + ", andar=" + andar + '}';
    }
}
