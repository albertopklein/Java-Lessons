package ljbd.model;

public class Setor {
	
	private Integer id;
	
	private String nome;
	
	private Integer andar;
	
	public Setor(Integer id, String nome, Integer andar) {
		this.id = id;
		this.nome = nome;
		this.andar = andar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAndar() {
		return andar;
	}

	public void setAndar(Integer andar) {
		this.andar = andar;
	}

	@Override
	public String toString() {
		return id + " - " + nome + " - andar: " + andar;
	}
	
	
	
	
}
