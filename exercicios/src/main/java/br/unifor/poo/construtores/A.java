package br.unifor.poo.construtores;

public class A extends B{
	
	private String num;
	
	public A(String num) {
//		this();
		System.out.println("Estou em A");
		this.num = num;
	}
	
	public A(){
		System.out.println("Estou em A - Default");
	}

}
