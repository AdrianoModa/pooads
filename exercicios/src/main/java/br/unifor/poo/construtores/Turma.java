package br.unifor.poo.construtores;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	@Deprecated
	public void addAluno(int indice, Aluno aluno){
		alunos.add(indice, aluno);
	}
	
	public void addAluno(int indice, Aluno aluno, int index){
		alunos.add(indice, aluno);
	}
	
	public Aluno get(int i){
		return alunos.get(i);
	}
	
	public int tamanho(){
		return alunos.size();
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
	
}
