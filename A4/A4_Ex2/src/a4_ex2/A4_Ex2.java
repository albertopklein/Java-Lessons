/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a4_ex2;

/**
 *
 * @author Alberto
 */
public class A4_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ContaBancaria contapf = new ContaBancaria("Fulano", 2500);
//        
//        System.out.println(contapf);
//
//        ContaBancariaPJ contapj = new ContaBancariaPJ("Beltrano", 10000, "EuCurso");
//        
//        System.out.println(contapj);
//        
//        ContaBancaria conta = new ContaBancariaPJ("Fulano Jr.", 500, "TuCurso");
//        
//        System.out.println(conta);
        //Animal a1 = new Animal("Zalt", 1.2, 120);
        //System.out.println(a1);
        
        Animal a2 = new Humano("Zeca", 15, "Homosapiens", 1.6, 60);
        System.out.println(a2);
        a2.Comunicar();
        
        Animal a3 = new Macaco("Safari Angola", "Orangotango", 1, 45);
        System.out.println(a3);
        a3.Comunicar();
        
        Humano h1 = new Humano("Zeca2", 20, "Homosapiens", 1.8, 100);
        System.out.println(h1);
        
        Macaco m1 = new Macaco("Amazonia", "Chipanze", 0.8, 35);
        System.out.println(m1);
        
    }
    
}
