/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula6;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alberto
 */
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        
        List<String> verduras = new LinkedList<>();
        verduras.add("Cebola");
        
        frutas.add("Laranja");
        frutas.add("Morango");
        frutas.add("Laranja");
        
        Set<String> frutasSet = new HashSet<>();
        Set<String> frutasTSet = new TreeSet<>();
        frutasSet.add("Laranja");
        frutasSet.add("Morango");
        frutasSet.add("Laranja");
        
        //frutas.addAll(frutasSet);
        frutasSet.addAll(Arrays.asList("Limão", "Abacate", "Abacaxi"));
        frutasTSet.addAll(Arrays.asList("Laranja","Morango","Limão", "Abacate", "Abacaxi"));
        System.out.println("List: " + frutas);
        System.out.println("Set: " + frutasSet);
        System.out.println("Tree Set: " + frutasTSet);
        // HashSet aceita nulos mas não é ordenado
        // TreeSet não aceita nulos e é ordenado
        
        //List<String> marcas = new ArrayList<>(Arrays.asList("Laranja","Morango","Limão", "Abacate", "Abacaxi")); 
        // Não é possível criar listas a partir de Arrays.asList
        
        //SET é melhor pois confere se já existe o elemento na estrutura.
    }
    
}
