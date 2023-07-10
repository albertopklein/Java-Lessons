/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lojabancodedados.model.Produto;
import lojabancodedados.model.Setor;

/**
 *
 * @author Alberto
 */
public class ProdutoRepository implements BancoDeDados<Produto>{

    SetorRepository setorRepository = new SetorRepository();
        
    @Override
    public Produto inserir(Produto produto) {
        String sql = "INSERT INTO produto (nome, codigoDeBarras, valor, setor_id) values (?,?,?,?)";
        Connection conexao = Conexao.obter();
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, produto.getNome());
            ps.setLong(2, produto.getCodigoDeBarras());
            ps.setDouble(3, produto.getValor());
            ps.setInt(4, produto.getSetor().getId());
            
            int resultado = ps.executeUpdate();
            if(resultado > 0) {
                System.out.println("Exito ao inserir produto!");
                ResultSet idGerado = ps.getGeneratedKeys();
                if(idGerado.next()){
                    int id = idGerado.getInt(1);
                    produto.setId(id);
                }
                idGerado.close();
            }
            else System.out.println("Erro ao inserir produto! ");
            
            return produto;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto");
            return null;
        } finally{
            Conexao.fechar();
        }
    }

    @Override
    public List<Produto> buscarTodos() {
        String sql = "SELECT * FROM produto";
        List<Produto> produtos = new ArrayList<>();
        Connection conexao = Conexao.obter();
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet resultado = ps.executeQuery();  
            //resultado.last();
            //int size = resultado.getRow();
            //System.out.println(size);
            System.out.println("=================");
            while(resultado.next()){
                
                Integer id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                Long codigoDeBarras = resultado.getLong("codigoDeBarras");
                Double valor = resultado.getDouble("valor");
                Integer setor_id = resultado.getInt("setor_id");
                Setor s1 = this.setorRepository.buscarPorID(setor_id);
                System.out.println("ID: "+ id + " - nome: " + nome + " - codigo de barras: " + codigoDeBarras + " - valor: "+ valor + " setor = " + s1 );
                Produto produto = new Produto(id, nome, codigoDeBarras, valor, s1);
                produtos.add(produto);
            }
            
            //return produtos; // return list of produtos
        } catch (SQLException e){
            System.out.println("Erro ao buscar lista de produtos: " + e.getMessage());
            return null;
        } finally{
            
            Conexao.fechar();
        }
        return produtos;
    }

    @Override
    public Produto buscarPorID(int id) {
        String sql = "SELECT * FROM produto where id = ?";
        Connection conexao = Conexao.obter();
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet resultado = ps.executeQuery();  
            
           if(resultado.next()){
               
                String nome = resultado.getString("nome");
                Long codigoDeBarras = resultado.getLong("codigoDeBarras");
                Double valor = resultado.getDouble("valor");
                Integer setor_id = resultado.getInt("setor_id");
                Setor s1 = setorRepository.buscarPorID(setor_id);
                System.out.println("ID: "+ id + " - nome: " + nome + " - codigo de barras: " + codigoDeBarras + " - valor: "+ valor + " setor_id = " + s1 );
                Produto p1 = new Produto(id, nome, codigoDeBarras, valor, s1);
                return p1;
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
    String sql = "DELETE from produto WHERE id = ?";
        Connection conexao = Conexao.obter();

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,id);
            
            int sucesso = ps.executeUpdate();
            if(sucesso > 0){
                System.out.println("Produto deletado com sucesso");
            }
            else System.out.println("Nao foi possível Produto setor");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar produto: " + e.getMessage());
        } finally{
            Conexao.fechar();
        }
    }

    @Override
    public Produto atualizar(Produto produto) {
    String sql = "UPDATE setor SET nome = ?, codigoDeBarras = ?, valor = ?, setor_id = ? where id = ? ";
        Connection conexao = Conexao.obter();
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setLong(2, produto.getCodigoDeBarras());
            ps.setDouble(3, produto.getValor());
            ps.setInt(4, produto.getSetor().getId());
            ps.setInt(5, produto.getId());
                        
            int sucesso = ps.executeUpdate();
            if(sucesso > 0){
                System.out.println("Nome do Produto atualizado com sucesso");
            }
            else System.out.println("Nao foi possível atualizar Nome de Produto");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Produto: " + e.getMessage());
        } finally{
            Conexao.fechar();
            return produto;
        }
    }
    
}
