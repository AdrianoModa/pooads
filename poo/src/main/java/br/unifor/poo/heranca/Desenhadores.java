package br.unifor.poo.heranca;

public interface Desenhadores {

	Double PI = 3.14;
	
	void desenhar();
	
	public static Double getPI(){
		return PI;
	}
	
	public default void teste(){
		System.out.println("teste");
	}
	
	public default void teste2(){
		System.out.println("teste");
	}


}
