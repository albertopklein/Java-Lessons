/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

import java.util.List;

/**
 *
 * @author Alberto
 */
public class Gerenciador {
   private String campo1;
   public Integer campo2;
   
   public Gerenciador(){
       
   }

    public String getCampo1() {
        Singleton singleton = Singleton.getInstance();
        return singleton.getCampo1();
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public Integer getCampo2() {
        return campo2;
    }

    public void setCampo2(Integer campo2) {
        this.campo2 = campo2;
    }
    
   public Gerenciador(String campo1, Integer campo2){
       this.campo1 = campo1;
       this.campo2 = campo2;
   }
}
