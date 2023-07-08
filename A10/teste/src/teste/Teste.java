/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alberto
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        
        a1.move();
        Map<String, Integer> idades = new HashMap<String, Integer>();
        idades.put("Amanda", 25);
        idades.put("Joao", 30);
        idades.put("Maria", 35);
        System.out.println(idades.get("Joao"));

    }
    
}
