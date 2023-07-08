/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import repository.Conexao;
import escola.Aluno;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
/**
 *
 * @author Alberto
 */
public class AlunosRepository implements BancoDeDados<Aluno> {

    @Override
    public Aluno inserir(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome) values (?)";
        Connection conexao = Conexao.obter();
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, aluno.getNome());
            
            int resultado = ps.executeUpdate();
            if(resultado > 0) {
                System.out.println("Exito ao inserir Aluno!");
                ResultSet idGerado = ps.getGeneratedKeys();
                if(idGerado.next()){
                    int id = idGerado.getInt(1);
                    aluno.setId(id);
                }
                idGerado.close();
            }
            else System.out.println("Erro ao inserir Aluno! ");
            
            return aluno;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir Aluno");
            return null;
        } finally{
            Conexao.fechar();
        }
    }

    @Override
    public List<Aluno> buscarTodos() {
        String sql = "SELECT * FROM aluno";
        Connection conexao = Conexao.obter();
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet resultado = ps.executeQuery();  
            List<Aluno> alunos = new ArrayList<>();
            while(resultado.next()){
                Integer id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                
                System.out.println("ID: "+ id + " - nome: " + nome);
                Aluno a1 = new Aluno(id, nome);
                alunos.add(a1);
            }
            
            return alunos; // return list of setores
        } catch (SQLException e){
            System.out.println("Erro ao consultar aluno: " + e.getMessage());
            return null;
        } finally {
            Conexao.fechar();
        }
    }

    @Override
    public Aluno buscarPorID(int id) {
        String sql = "SELECT * FROM aluno where id = ?";
        Connection conexao = Conexao.obter();
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet resultado = ps.executeQuery();  
            
           if(resultado.next()){
                
                String nome = resultado.getString("nome");
                
                System.out.println("ID: "+ id + " - nome: " + nome);
                Aluno a1 = new Aluno(id, nome);
                return a1;
            } else{
               System.out.println("Problema ao remover Aluno");
               return null;
           }
        } catch (SQLException e){
            System.out.println("Erro ao buscar Aluno: " + e.getMessage());
            return null;
        } finally{
            Conexao.fechar();
        }
    }

    @Override
    public void excluir(int id) {
        String sql = "DELETE from aluno WHERE id = ?";
        Connection conexao = Conexao.obter();

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,id);
            
            int sucesso = ps.executeUpdate();
            if(sucesso > 0){
                System.out.println("Aluno deletado com sucesso");
            }
            else System.out.println("Nao foi possível deletar Auno");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar Aluno: " + e.getMessage());
        } finally{
            Conexao.fechar();
        }
    }
    
    public void updateNome(int id, String nome){
        String sql = "UPDATE aluno SET nome = ? where id = ? ";
        Connection conexao = Conexao.obter();
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setInt(2, id);
                        
            int sucesso = ps.executeUpdate();
            if(sucesso > 0){
                System.out.println("Nome do Aluno atualizado com sucesso");
            }
            else System.out.println("Nao foi possível atualizar Nome de aluno");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Aluno: " + e.getMessage());
        } finally{
            Conexao.fechar();
        }
        
    }  
}
