/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4_ex2;

/**
 *
 * @author Alberto
 */
public class Macaco extends Animal {
    private String safariName;
    
    public Macaco(String safariName, String species, double size, double weight){
        super(species, size, weight);
        this.safariName = safariName;
    }

    @Override
    public String toString() {
        return "Macaco{" + "safariName=" + safariName+
                ", species= " +super.species +
                ", size= " + this.size +
                ", weight= " + super.weight +'}';
    }

    @Override
    public void Comunicar() {
        System.out.println("Uh uh aha aha");
    }

    
}
