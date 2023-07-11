package ljbd.model;

public class Produto {

	private Integer id;
	
	private String nome;
	private long codigoDeBarras;
	private double valor;
	private Setor setor;
	
	
	public Produto(Integer id, String nome, long codigoDeBarras, double valor, Setor setor) {
		this.id = id;
		this.nome = nome;
		this.codigoDeBarras = codigoDeBarras;
		this.valor = valor;
		this.setor = setor;
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
	public long getCodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setCodigoDeBarras(long codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	
}
