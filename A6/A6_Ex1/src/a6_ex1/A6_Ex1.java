/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a6_ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
/**
 *
 * @author Alberto
 */
public class A6_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>(Arrays.asList("Maça", "Laranja", "Limaão" , "Pera" , "Abacate" , "Morango" , "Ameixa", "Manga", "Maracujá"));
        // versao extendida
        /*System.out.println("Lista Original de frutas" + frutas);
        Predicate<String> iniciaComM = nome -> nome.startsWith("M");
        frutas.removeIf(iniciaComM);
        System.out.println("Frutas Sem M List before stream: " + frutas);
        Stream<String> frutasStream = frutas.stream();
        
        List<String> frutasSemM = frutasStream.collect(Collectors.toList());
        System.out.println("Frutas sem M List: " + frutasSemM);
        */
        // versao resumida com stream filter
        
        List<String> frutasSemM3 = frutas.stream().filter(nome -> !nome.startsWith("M")).collect(Collectors.toList());
        System.out.println("Versao resumida list com stream filter: "+ frutasSemM3);
        
        // versao resumida sem stream filter
        frutas.removeIf(nome -> nome.startsWith("M"));
        List<String> frutasSemM2 = frutas.stream().collect(Collectors.toList());
        System.out.println("Versao resumida list: "+ frutasSemM2);
        
        
    }
    
}
