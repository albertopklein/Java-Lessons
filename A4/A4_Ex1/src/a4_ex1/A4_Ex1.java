/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a4_ex1;
import java.util.ArrayList;
/**
 *
 * @author Alberto
 */
public class A4_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Funcionario> listFunc = new ArrayList<>();
        
        listFunc.add(new Funcionario("Fulano1", "Assinar Docs", "CEO"));
        listFunc.add(new Funcionario("Fulano2", "Assinar Docs", "CEO"));
        listFunc.add(new Funcionario("Fulano3", "Assinar Docs", "CEO"));
        listFunc.add(new Funcionario("Fulano4", "Assinar Docs", "CEO"));
        listFunc.add(new Funcionario("Fulano5", "Assinar Docs", "CEO"));
        listFunc.add(new Funcionario("Fulano6", "Assinar Docs", "CEO"));
        listFunc.add(new Funcionario("Fulano7", "Assinar Docs", "CEO"));
        listFunc.add(new Funcionario("Fulano8", "Assinar Docs", "CEO"));
        listFunc.add(new Funcionario("Fulano9", "Assinar Docs", "CEO"));
        
        
        System.out.println(listFunc);
    
        for(int i = 0; i < listFunc.size(); i++){
            System.out.println(listFunc.get(i));
        }
    }
    
}
