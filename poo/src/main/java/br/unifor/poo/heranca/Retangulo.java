package br.unifor.poo.heranca;


/**
 * @author professort18
 * @since 1.0 14/10/2016
 * */
public class Retangulo implements Figura {

	private Double base;
	private Double altura;
	
	public Retangulo() {
	}
	
	public Retangulo(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double calcularArea() {
		return base * altura;
	}
	
	/**
	 * Deve ser usado apenas quando a base e altura
	 * de um retangulo forem iguais.
	 * @param lado do retangulo
	 * @return valor da área
	 * */
	public Double calcularArea(Double lado){
		return lado * lado;
	}

	public Double getBase() {
		return base;
	}
	protected void setBase(Double base) {
		this.base = base;
	}
	public Double getAltura() {
		return altura;
	}
	protected void setAltura(Double altura) {
		this.altura = altura;
	}
	
}
