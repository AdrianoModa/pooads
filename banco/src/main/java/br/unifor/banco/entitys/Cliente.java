package br.unifor.banco.entitys;

public class Cliente {

	// atributos do objeto
	private String nome;
	private String cpf;
	private Boolean ativo;
	private Integer idade;
	
	private static Integer maxQtdaBracos = 2;

	public Cliente(String nome, String cpf, Boolean ativo, Integer idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ativo = ativo;
		this.idade = idade;
	}

	// métodos acessores getts and setts
	
	public String getNome() {
		return this.nome;
	}

	public static Integer getMaxQtdaBracos() {
		return maxQtdaBracos;
	}

	public static void setMaxQtdaBracos(Integer maxQtdaBracos) {
		Cliente.maxQtdaBracos = maxQtdaBracos;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		if (idade > 0) {
			this.idade = idade;
		}
	}

	public Boolean isAtivo() {
		return this.ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", ativo=" + ativo + ", idade=" + idade + "]";
	}

}
