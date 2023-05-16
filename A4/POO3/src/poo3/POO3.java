/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo3;
import java.util.ArrayList;
/**
 *
 * @author Alberto
 */
public class POO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] arrayInt = new int[3];
//        arrayInt[0] = 1;
//        arrayInt[1] = 2;
//        arrayInt[2] = 3;
//        for(int i = 0; i < arrayInt.length; i++){
//            System.out.println(arrayInt[i]);
//        }
//        
//        ArrayList<Integer> listInt = new ArrayList<>();
//        
//        listInt.add(10);
//        listInt.add(20);
//        listInt.add(30);
//        listInt.add(40);
//        listInt.add(50);
//        listInt.add(60);
//        listInt.add(70);
//        listInt.add(80);
//        
//        listInt.remove(0); //remover pos 0
//        listInt.remove(new Integer(20)); // remover valor especifico de um arraylist
//        
//        for(int i = 0; i < listInt.size(); i++){ // para pegar pos especificar usar get 
//            System.out.println(listInt.get(i));
//        }
//        
//        for(Integer inteiro : listInt){
//            System.out.println(inteiro);
//        }
//        
//        System.out.println(listInt);
//
//        ArrayList<String> listStr = new ArrayList<>();
//    
//        listStr.add("Banana");
//        listStr.add("Maça");
//        listStr.add("Coco");
//        listStr.add("Banana");
//        
//        
//        System.out.println(listStr);
//        
        ContaBancaria contapf = new ContaBancariaPF("Fulano", 2500);
        
        System.out.println(contapf);
        contapf.mostrarSaldo();
        contapf.sacar(2400.00);
        contapf.mostrarSaldo();
        ContaBancariaPJ contapj = new ContaBancariaPJ("Beltrano", 10000, "EuCurso");
        
        System.out.println(contapj);
        contapj.mostrarSaldo();
        
        ContaBancaria conta = new ContaBancariaPJ("Fulano Jr.", 500, "TuCurso");
        
        System.out.println(conta);
    
        
    }
    
}
