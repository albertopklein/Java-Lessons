/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4_ex2;

/**
 *
 * @author Alberto
 */
public class Humano extends Animal{
    private String name;
    private int idade;
    
    public Humano(String name, int idade, String species, double size, double weight){
        super(species, size, weight);
        this.name = name;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Humano{" + "name= " + name +
                ", idade= " + idade +
                ", species= " +super.species +
                ", size= " + this.size +
                ", weight= " + super.weight +'}';
    }
    
}
