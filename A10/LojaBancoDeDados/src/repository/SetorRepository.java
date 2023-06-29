/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;


import java.util.List;
import lojabancodedados.model.Setor;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Alberto
 */
public class SetorRepository implements BancoDeDados<Setor> {

    @Override
    public Setor inserir(Setor setor) {
        String sql = "INSERT INTO setor (nome, andar) values (?,?)";
        Connection conexao = Conexao.obter();
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, setor.getNome());
            ps.setInt(2, setor.getAndar());
            
            int resultado = ps.executeUpdate();
            if(resultado > 0) {
                System.out.println("Exito ao inserir setor!");
                ResultSet idGerado = ps.getGeneratedKeys();
                if(idGerado.next()){
                    int id = idGerado.getInt(1);
                    setor.setId(id);
                }
                idGerado.close();
            }
            else System.out.println("Erro ao inserir setor! ");
            
            return setor;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir Setor");
            return null;
        }      
    }

    @Override
    public List<Setor> buscarTodos() {
        String sql = "SELECT * FROM setor";
        Connection conexao = Conexao.obter();
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet resultado = ps.executeQuery();  
            List<Setor> setores = new ArrayList<>();
            while(resultado.next()){
                int id = resultado.getInt("id");
                String login = resultado.getString("nome");
                String senhaR = resultado.getString("andar");
                
                System.out.println("ID: "+ id + " - login: " + login + " - senha: " + senhaR);
                Setor s1 = new Setor()
            }
            return 
        } catch (SQLException e){
            System.out.println("Erro ao consultar usuario: " + e.getMessage());
            return null;
        }
        
    }

    @Override
    public Setor buscarPorID(int id) {
        String sql = "SELECT * FROM setor where id = ?";
        Connection conexao = Conexao.obter();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(int id) {
        String sql = "INSERT INTO setor (nome, andar) values (?,?)";
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
