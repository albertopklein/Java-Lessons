package ljbd.repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ljbd.model.Produto;
import ljbd.model.Setor;

public class ProdutoRepository implements BancoDeDados<Produto>{

	SetorRepository setorRepository = new SetorRepository();
	
	@Override
	public Produto inserir(Produto produto) {
		String sql = "INSERT INTO produto (nome, codigoDeBarras, valor, setor_id) values(?, ?, ?, ?)";
		
		Connection conexao = Conexao.obter();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);			
			ps.setString(1, produto.getNome());
			ps.setLong(2, produto.getCodigoDeBarras());
			ps.setDouble(3, produto.getValor());
			ps.setInt(4, produto.getSetor().getId());
			
			int resultado = ps.executeUpdate();
			
			if(resultado > 0) {
				System.out.println("Produto inserido com sucesso!");
				
				ResultSet idGerado = ps.getGeneratedKeys();
				
				if(idGerado.next()) {
					int id = idGerado.getInt(1);
					produto.setId(id);
				}
			}else {
				System.out.println("Não foi possível inserir o produto");
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao inserir o novo produto: " + e.getMessage());
		} finally {
			Conexao.fechar();
		}
		
		return produto;
	}

	@Override
	public List<Produto> buscarTodos() {
		
		List<Produto> produtos = new ArrayList<>();
		
		String sql = "SELECT * FROM produto";		
		Connection conexao = Conexao.obter();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ResultSet resultado = ps.executeQuery();
			
			while(resultado.next()) {
				int id = resultado.getInt("id");
				String nome = resultado.getString("nome");
				Double valor = resultado.getDouble("valor");
				Long codDeBarras = resultado.getLong("codigoDeBarras");
				
				int idSetor = resultado.getInt("setor_id");				
				Setor setor = this.setorRepository.buscarPorId(idSetor);
				
				Produto produto = new Produto(id, nome, codDeBarras, valor, setor);
				
				produtos.add(produto);
			}
		} catch (SQLException e) {
			System.out.println("Não foi possivel retornar todos os produtos: " + e.getMessage());
		}finally {
			Conexao.fechar();
		}
		
		return produtos;
	}

	@Override
	public Produto buscarPorId(int id) {
		String sql = "SELECT * FROM produto WHERE id = ?";		
		Connection conexao = Conexao.obter();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet resultado = ps.executeQuery();
			
			while(resultado.next()) {
				String nome = resultado.getString("nome");
				Double valor = resultado.getDouble("valor");
				Long codDeBarras = resultado.getLong("codigoDeBarras");
				
				int idSetor = resultado.getInt("setor_id");				
				Setor setor = this.setorRepository.buscarPorId(idSetor);
				
				return new Produto(id, nome, codDeBarras, valor, setor);
			}
		} catch (SQLException e) {
			System.out.println("Não foi possivel retornar todos os produtos: " + e.getMessage());
		}finally {
			Conexao.fechar();
		}
		
		return null;
	}

	@Override
	public void excluir(int id) {
		String sql =  "DELETE FROM produto WHERE id = ?";
		
		Connection conexao = Conexao.obter();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id);
			
			int resultado = ps.executeUpdate();
			
			if(resultado > 0) {
				System.out.println("Produto excluído com sucesso!");
			}else {
				System.out.println("Erro ao excluir o produto com id: " + id);
			}
			
		} catch (SQLException e) {
			System.out.println("Não foi excluir o produto com id: " + id + " - " + e.getMessage());			

		}		
	}

	@Override
	public Produto atualizar(Produto produto) {
		String sql = "UPDATE produto SET nome = ?, codigoDeBarras = ?, "
								+ "valor = ?, setor_id = ? WHERE id = ?";
		
		Connection conexao = Conexao.obter();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);			
			ps.setString(1, produto.getNome());
			ps.setLong(2, produto.getCodigoDeBarras());
			ps.setDouble(3, produto.getValor());
			ps.setInt(4, produto.getSetor().getId());
			ps.setInt(5, produto.getId());
			
			int resultado = ps.executeUpdate();
			
			if(resultado > 0) {
				System.out.println("Produto atualizado com sucesso!");
			}else {
				System.out.println("Não foi possível atualizar o produto");
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar o novo produto: " + e.getMessage());
		} finally {
			Conexao.fechar();
		}
		
		return produto;	
	}

}
