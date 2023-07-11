package ljbd.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ljbd.model.Setor;

public class SetorRepository implements BancoDeDados<Setor>{

	@Override
	public Setor inserir(Setor setor) {
		String sql = "INSERT INTO setor (nome, andar) values (?, ?)";
		
		Connection conexao = Conexao.obter();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, setor.getNome());
			ps.setInt(2, setor.getAndar());
			
			int resultado = ps.executeUpdate();
			
			if(resultado > 0) {
				System.out.println("Novo setor cadastrado com sucesso!");
				
				ResultSet idGerado = ps.getGeneratedKeys();
				
				if(idGerado.next()) {
					int id = idGerado.getInt(1);
					setor.setId(id);
				}
				
				idGerado.close();
			}else {
				System.out.println("Erro ao cadastrar um novo setor");
				return null;
			}
			
			return setor;
			
		} catch (SQLException e) {
			System.out.println("Erro ao inserir um novo setor: " + e.getMessage());			
			return null;
			
		} finally {
			Conexao.fechar();
		}
		
	}

	@Override
	public List<Setor> buscarTodos() {
		
		List<Setor> setores = new ArrayList<>();
		
		String sql = "SELECT * FROM setor";
		
		Connection conexao = Conexao.obter();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ResultSet resultado = ps.executeQuery();
			
			while(resultado.next()) {
				int id = resultado.getInt("id");
				String nome = resultado.getString("nome");
				int andar = resultado.getInt("andar");
				
				Setor setor = new Setor(id, nome, andar);
				
				setores.add(setor);
			}
			
		} catch (SQLException e) {
			System.out.println("Não foi possível retornar todos os setores: " + e.getMessage());			
			return null;
		} finally {
			Conexao.fechar();
		}
		
		return setores;
	}

	@Override
	public Setor buscarPorId(int id) {
		String sql = "SELECT * FROM setor WHERE id = ?";
		
		Connection conexao = Conexao.obter();
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet resultado = ps.executeQuery();
			
			while(resultado.next()) {
				String nome = resultado.getString("nome");
				int andar = resultado.getInt("andar");
				
				return new Setor(id, nome, andar);					
			}
			
		} catch (SQLException e) {
			System.out.println("Não foi possível retornar o setor com id: " + id + " - " + e.getMessage());			
			return null;
		} finally {
			Conexao.fechar();
		}
		
		return null;
	}

	@Override
	public void excluir(int id) {
		String sql =  "DELETE FROM setor WHERE id = ?";
		
		Connection conexao = Conexao.obter();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id);
			
			int resultado = ps.executeUpdate();
			
			if(resultado > 0) {
				System.out.println("Setor excluído com sucesso!");
			}else {
				System.out.println("Erro ao excluir o setor com id: " + id);
			}
			
		} catch (SQLException e) {
			System.out.println("Não foi excluir o setor com id: " + id + " - " + e.getMessage());			

		}
		
	}

	@Override
	public Setor atualizar(Setor setor) {
		String sql = "UPDATE setor SET nome = ?, andar = ? WHERE id = ?";
		
		Connection conexao = Conexao.obter();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, setor.getNome());
			ps.setInt(2, setor.getAndar());
			ps.setInt(3, setor.getId());
			
			int resultado = ps.executeUpdate();
			
			if(resultado > 0) {
				System.out.println("Setor atualizado com sucesso!");
			}else {
				System.out.println("Não foi possivel atualizar o setor com id: " + setor.getId());
			}
			
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar setor com id: " + setor.getId() + " - " + e.getMessage());
		}
		
		return setor;
	}

}
