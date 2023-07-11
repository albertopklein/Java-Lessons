package ljbd.repository;

import java.util.List;

public interface BancoDeDados<T> {

	public T inserir(T t);
	public List<T> buscarTodos();
	public T buscarPorId(int id);
	public void excluir(int id);
	public T atualizar(T t);
}
