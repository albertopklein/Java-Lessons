/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaebancodedados;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Alberto
 */
public class BancoDeDados {
    private static final String URL = "jdbc:mysql://localhost:3306/aula12";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    public static void obterConexao(){
        try{
            DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexao obtida com sucesso!");
        } catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Erro ao obter a conexao!");
        }
        
    }
}
