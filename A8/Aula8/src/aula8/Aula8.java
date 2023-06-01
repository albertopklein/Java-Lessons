/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Alberto
 */
public class Aula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ------- Start Reflection
        Class<?> clazz = Gerenciador.class;
        
        System.out.println(clazz.getConstructors());
        
        Constructor[] construtores = clazz.getConstructors();
        
        for(Constructor construtor : construtores){
            System.out.println(construtor);
        }
        
        System.out.println("-----------------");
        
        Field[] atributos = clazz.getDeclaredFields();
        
        for(Field atributo : atributos){
            System.out.println(atributo);
        }
        
        System.out.println("-----------------");

        
        Method[] metodos = clazz.getDeclaredMethods();
        
        for(Method metodo : metodos){
            System.out.println(metodo);
            //metodo.invoke(args, args);
        }
        // ------------------------- End Reflection
        
        Singleton singleton = Singleton.getInstance();
        
        singleton.setCampo1("teste 2!");
        
        
        
        Gerenciador ger = new Gerenciador();
        
        System.out.println(ger.getCampo1());
        
    }
    
    
}
