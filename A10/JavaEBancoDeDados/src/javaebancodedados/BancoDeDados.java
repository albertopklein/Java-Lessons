/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaebancodedados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Alberto
 */
public class BancoDeDados {
    private static Connection conexao;
    private static final String URL = "jdbc:mysql://localhost:3306/aula12";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    public static Connection obterConexao(){
        try{
            if(conexao == null || conexao.isClosed()){
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            }
            System.out.println("Conexao obtida com sucesso!");
            return conexao;
        } catch (SQLException e)
        {
            System.out.println("Erro ao obter a conexao!" + e.getMessage());
            
        }
        return null;
    }
    
    public static void fecharConexao(){
        try{
            if(conexao != null && !conexao.isClosed()){
                conexao.close();
                conexao = null;
            }
        } catch (SQLException e){
            System.out.println("Erro ao fechar a conexao!" + e.getMessage());
        }
    }
}
