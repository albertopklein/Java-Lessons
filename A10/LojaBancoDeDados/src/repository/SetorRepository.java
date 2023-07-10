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
        } finally{
            Conexao.fechar();
        }      
    }

    @Override
    public List<Setor> buscarTodos() {
        String sql = "SELECT * FROM setor";
        List<Setor> setores = new ArrayList<>();
        Connection conexao = Conexao.obter();
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet resultado = ps.executeQuery();  
            
            while(resultado.next()){
                Integer id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                Integer andarR = resultado.getInt("andar");
                
                System.out.println("ID: "+ id + " - nome: " + nome + " - andar: " + andarR);
                Setor s1 = new Setor(id, nome, andarR);
                setores.add(s1);
            }
            
            //return setores; // return list of setores
        } catch (SQLException e){
            System.out.println("Erro ao consultar usuario: " + e.getMessage());
            return null;
        } finally{
            Conexao.fechar();
        }
        return setores;
    }

    @Override
    public Setor buscarPorID(int id) {
        String sql = "SELECT * FROM setor where id = ?";
        Connection conexao = Conexao.obter();
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet resultado = ps.executeQuery();  
            
           if(resultado.next()){
               
                String nome = resultado.getString("nome");
                Integer andarR = resultado.getInt("andar");
                
                System.out.println("ID: "+ id + " - nome: " + nome + " - andar: " + andarR);
                Setor s1 = new Setor(id, nome, andarR);
                return s1;
            } else{
               System.out.println("Problema ao remover Setor");
               return null;
           }
        } catch (SQLException e){
            System.out.println("Erro ao buscar Setor: " + e.getMessage());
            return null;
        } finally{
            Conexao.fechar();
        }
    }

    @Override
    public void excluir(int id) {
        String sql = "DELETE from setor WHERE id = ?";
        Connection conexao = Conexao.obter();

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,id);
            
            int sucesso = ps.executeUpdate();
            if(sucesso > 0){
                System.out.println("Setor deletado com sucesso");
            }
            else System.out.println("Nao foi possível deletar setor");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar setor: " + e.getMessage());
        } finally{
            Conexao.fechar();
        }
    }

    @Override
    public Setor atualizar(Setor setor) {
        String sql = "UPDATE setor SET nome = ?, andar = ? where id = ? ";
        Connection conexao = Conexao.obter();
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, setor.getNome());
            ps.setInt(2, setor.getAndar());
            ps.setInt(3, setor.getId());
                        
            int sucesso = ps.executeUpdate();
            if(sucesso > 0){
                System.out.println("Nome do Setor atualizado com sucesso");
            }
            else System.out.println("Nao foi possível atualizar Nome de Setor");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Setor: " + e.getMessage());
        } finally{
            Conexao.fechar();
            return setor;
        }
    }
    
}
