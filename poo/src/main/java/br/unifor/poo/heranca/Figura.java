package br.unifor.poo.heranca;

public interface Figura extends Desenhadores {

	Double calcularArea();
	
	
	public default void desenhar(){
		System.out.println("Área da Figura: " + this.calcularArea());
	}
	
}
