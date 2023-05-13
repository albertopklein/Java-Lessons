/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4_ex2;

/**
 *
 * @author Alberto
 */
public class Animal {
    protected String species;
    protected double size;
    protected double weight;
    
    public Animal(String species, double size, double weight){
        this.species = species;
        this.size = size;
        this.weight = weight;
    }

    public String getspecies() {
        return species;
    }

    public void setspecies(String species) {
        this.species = species;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" + "species=" + species + ", size=" + size + ", weight=" + weight + '}';
    }
    
    
}
