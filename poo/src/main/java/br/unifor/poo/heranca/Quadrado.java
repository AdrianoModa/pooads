package br.unifor.poo.heranca;

public class Quadrado extends Retangulo {

	private Double lado;
	
	public Quadrado(Double lado) {
		this.lado = lado;
		this.setBase(this.lado);
		this.setAltura(this.lado);
	}
	
	@Override
	public Double calcularArea() {
		return this.lado * this.lado;
	}

}
