package br.unifor.poo.heranca;

public class Desenhista {
	
	static Double raio = 5d;
	
	//polimorfismo tardio
	public Double draw(Figura fig){
		return fig.calcularArea();
	}
	
	//classe anônima
	public void draw(){
//		Figura fig = new Figura() {
//			@Override
//			public Double calcularArea() {
//				return 2 * PI * raio;
//			}
//		};
		Figura fig = () -> {return 2 * Figura.PI * raio;};
		System.out.println(fig.calcularArea());
	}
	
	public static void main(String[] args) {
		Desenhista d = new Desenhista();
		d.draw();
	}

}
