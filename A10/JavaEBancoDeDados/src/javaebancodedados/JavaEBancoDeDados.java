/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaebancodedados;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Alberto
 */
public class JavaEBancoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do usuario: ");
        String nome = sc.nextLine();
        System.out.println("Digite a senha do usuario: ");
        String senha = sc.nextLine();
        if(nome == null || senha == null){
            System.out.println("Erro!");
            return;
        }
        Connection conexao = BancoDeDados.obterConexao();
        
        String sql = "INSERT INTO usuario (login,senha) values (?,?)";
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, senha);
            
            int sucesso =  ps.executeUpdate();
            
            if(sucesso > 0){
                System.out.println("Usuario inserido com sucesso");
            }
            else System.out.println("Nao foi possível inserir usuário");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuario: " + e.getMessage());
        }
        System.out.println("======================================");
        sql = "SELECT * FROM usuario";
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet resultado = ps.executeQuery();  
            
            while(resultado.next()){
                int id = resultado.getInt("id");
                String login = resultado.getString("login");
                String senhaR = resultado.getString("senha");
                
                System.out.println("ID: "+ id + " - login: " + login + " - senha: " + senhaR);
            }
        } catch (SQLException e){
            System.out.println("Erro ao consultar usuario: " + e.getMessage());
        }
        
        System.out.println("======================================");
        System.out.println("Digite o id de um usuario para ser alterado: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite novo valor do campo: ");
        String novoValor = sc.nextLine();
        
        sql = "UPDATE usuario SET login = ? where id = ? ";
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, novoValor);
            ps.setInt(2, id);
                        
            int sucesso = ps.executeUpdate();
            if(sucesso > 0){
                System.out.println("Usuario atualizado com sucesso");
            }
            else System.out.println("Nao foi possível atualizar usuário");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar usuario: " + e.getMessage());
        }
        
        System.out.println("======================================");
        System.out.println("Digite o id de um usuario para ser excluido: ");
        id = sc.nextInt();
        
        sql = "DELETE from usuario WHERE id = ?";
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,id);
            
            int sucesso = ps.executeUpdate();
            if(sucesso > 0){
                System.out.println("Usuario deletado com sucesso");
            }
            else System.out.println("Nao foi possível deletar usuário");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar usuario: " + e.getMessage());
        }
        System.out.println("======================================");
        sql = "SELECT * FROM usuario";
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet resultado = ps.executeQuery();  
            
            while(resultado.next()){
                id = resultado.getInt("id");
                String login = resultado.getString("login");
                String senhaR = resultado.getString("senha");
                
                System.out.println("ID: "+ id + " - login: " + login + " - senha: " + senhaR);
            }
        } catch (SQLException e){
            System.out.println("Erro ao consultar usuario: " + e.getMessage());
        }
        BancoDeDados.fecharConexao();
    }
    
}
