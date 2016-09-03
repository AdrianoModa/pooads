package br.unifor.poo.exercicios;

public enum TipoCargo {
	DIRETORIA(1), GERENCIA(2), OPERACIONAL(3);
	
	private Integer codigo;
	
	private TipoCargo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
}
