/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula6_1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Alberto
 */
public class Aula6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> frutasList = new ArrayList<>();
        
        frutasList.add("Laranja");
        frutasList.add("Morango");
        frutasList.add("Limão");
        frutasList.add("Abacaxi");
        frutasList.add("Pera");
        
        //Consumer<String> imprimirNome = nome -> System.out.println("Teste: " + nome);
        
        //frutasList.forEach(imprimirNome);
        
        // versao resumida CONSUMER
        frutasList.forEach(nome -> System.out.println("Teste: " + nome));
        //System.out.println("List: " + frutasList);
        
        // ----- predicate -----
        //Predicate<String> iniciaComL = nome-> nome.startsWith("L");
        //frutasList.removeIf(iniciaComL);
        
        // versao resumida
        //frutasList.removeIf(nome-> !nome.startsWith("L"));
        
        frutasList.forEach(nome -> System.out.println("Teste pos predicado: " + nome));
        
        // --- streams ---
        Stream<String> frutasStream = frutasList.stream();
        // --- funcition que fica dentro do stream
        
        Function<String, Character> stringParaCaracter = nome -> nome.charAt(0);
        
        Stream<Character> characterStream = frutasStream.map(stringParaCaracter);
        
        List<Character> characterList = characterStream.collect(Collectors.toList());
        
        System.out.println("Character List:" + characterList);
        
        // versao resumida do function
        List<Character> charList2 = frutasList.stream().map(nome -> nome.charAt(0)).collect(Collectors.toList());
        
        
        System.out.println("Character List 2:" + charList2);
        
        
        List<String> nomes = new ArrayList<>(Arrays.asList("José", "João", "Maria", "Ana", "Vitor"));
        
        List<Funcionario> funcionarios = nomes.stream()
                                              .map(nome -> new Funcionario(nome))
                                              .collect(Collectors.toList());
        
        System.out.println(funcionarios);
        
        funcionarios.forEach(funcionario -> System.out.println(funcionario));
        
        // ---- DATE ----
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd//MM/yyyy HH:mm:ss");
        Date dataAtual = new Date();
        System.out.println(sdf.format(dataAtual));
        
        // ------ LOCAL DATE ---------
        
        LocalDate dataAtualLD = LocalDate.now(); // LocalDate só trabalha com dia mes e ano
        //DateTimeFormatter formatLD = DateTimeFormatter.ofPattern("dd//MM/yyyy");
        System.out.println(dataAtualLD);
        // ---- versao resumida
        System.out.println(dataAtualLD.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        // ---- LOCAL DATE TIME -----
        
        LocalDateTime timeAtualLD = LocalDateTime.now();
        System.out.println(timeAtualLD.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        
        
    }
    
}
