package br.unifor.poo.heranca;

public class DesenhistaDeTriangulos extends Desenhista {
	
	public Triangulo figuraFactory(String nomeDaFigura) {
		return new Triangulo(10d, 5d);
	}

}
