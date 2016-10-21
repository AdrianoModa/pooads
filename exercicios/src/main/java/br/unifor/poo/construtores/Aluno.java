package br.unifor.poo.construtores;

public class Aluno {

	private String matricula;
	private static final double PI_ALUNO = 3.14;
	
	public Aluno(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
