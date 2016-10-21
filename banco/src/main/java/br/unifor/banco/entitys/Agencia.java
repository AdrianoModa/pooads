package br.unifor.banco.entitys;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

	private String nome;
	private String numero;
	private List<Conta> contas = new ArrayList<Conta>();
	
	//Sobrecarga(Overload) de construtores
	public Agencia() {
		
	}
	
	public Agencia(String nome){
		this.nome = nome;
	}
	
	public Agencia(String nome, String numero){
		this(nome);
		this.numero = numero;
	}
	
	public Agencia(String nome, String numero, List<Conta> contas) {
		this(nome, numero);
		this.contas = contas;
	}
	
	public void addConta(Conta conta){
		contas.add(conta);
	}
	

	/**		métodos acessores	*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public List<Conta> getContas(){
		return this.contas;
	}
	
	public void removeConta(Conta conta){
		this.contas.remove(conta);
	}

	@Override
	public String toString() {
		return "Agencia [nome=" + nome + ", numero=" + numero + "]";
	}

}
