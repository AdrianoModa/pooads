package br.unifor.poo.heranca;

public class Triangulo implements Figura {

	private Double base;
	private Double altura;

	public Triangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Boolean isTrianguloRetangulo(){
		//calculo
		return true;
	}
	
	public Double calculaHipotenusa(){
		return 0d;
	}

	@Override
	public Double calcularArea() {
		return (this.base * this.altura) / 2;
	}
	
}
