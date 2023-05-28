/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a6_ex3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Alberto
 */
public class A6_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Compra> compras = new ArrayList<>();
        
        boolean teste = true;
        
        do{
            
            System.out.println("Digite 0 para inserir nova compra. ");
            System.out.println("Digite 1 para ver compras de dia especifico. ");
            System.out.println("Digite 2 para ver todas as compras");
            System.out.println("Digite 3 para encerrar. ");
            
            int opcao = sc.nextInt();
            sc.nextLine();
            if(opcao == 0){
                
                System.out.println("Digite nova compra:");
                String desc = sc.nextLine();
                System.out.println("Digite a data da Compra: dd/MM/yyyy");
                String date = sc.nextLine();
                LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                compras.add(new Compra(desc, localDate));
            }
            else if(opcao == 1){
                
                System.out.println("Qual a data que deseja ver as compras: dd/MM/yyyy");
                String date = sc.next();
                LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                
                List<Compra> comprasEspecificas = compras.stream().filter(compra -> compra.getDataCompra().equals(localDate)).collect(Collectors.toList());
                System.out.println("Compras do dia: " + date);
                comprasEspecificas.forEach(compra -> System.out.println(compra));
                /*
                boolean match = false;
                for(int i = 0; i < compras.size(); i++){
                    if(compras.get(i).getDataCompra().equals(localDate)){
                        System.out.println("Compra localizada: " + compras.get(i).toString());
                        match = true;
                    }
                }
                if(match == false){
                    System.out.println("Nenhum resultado encontrado! ");
                }
                System.out.println("Pesquisa encerrada! ");
                */
            }
            else if(opcao == 2){
                System.out.println("Ver todas as compras: ");
                compras.forEach(compra -> System.out.println(compra));
            }
            else if(opcao == 3){
                System.out.println("Encerrando!");
                teste = false;
            }
            else{
                System.out.println("Opçao invalida! Tente novamente!");
                continue;
            }
        }while(teste == true);
    }
    
}
