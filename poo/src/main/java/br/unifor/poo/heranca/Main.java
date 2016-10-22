package br.unifor.poo.heranca;

public class Main {

	public static void main(String[] args) {
		Desenhista desenhista = new Desenhista();
		System.out.println(desenhista.draw(new Retangulo(10d, 5d)));
	}
}
