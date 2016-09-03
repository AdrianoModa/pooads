package br.unifor.poo.exercicios;

import javax.swing.JOptionPane;

public class GerenciaEmprestimo {

	private static final Double PERCENTUAL_DIRETORIA = 0.3;
	private static final Double PERCENTUAL_GERENCIA = 0.25;
	private static final Double PERCENTUAL_OPERACIONAL = 0.2;
	
	public Double calculaEmprestimo(Integer cargo, double salario) {
				
		if (cargo == TipoCargo.DIRETORIA.getCodigo()) {
			return salario * PERCENTUAL_DIRETORIA;
		} else if (cargo == TipoCargo.GERENCIA.getCodigo()) {
			return salario * PERCENTUAL_GERENCIA;
		} else if (cargo == TipoCargo.OPERACIONAL.getCodigo()){
			return salario * PERCENTUAL_OPERACIONAL;
		}
		
		return null;
	}

	public static void main(String[] args) {
		String entradaCargo = JOptionPane.showInputDialog("Escolha uma das opções: \n"
				+ "1 - Diretoria \n"
				+ "2 - Gerencia \n"
				+ "3 - Operacional \n"
				+ "Informe seu cargo:");
		Integer cargo = Integer.parseInt(entradaCargo);
		String entradaSalario = JOptionPane.showInputDialog("Informe seu salário: ");
		Double salario = Double.parseDouble(entradaSalario.replace(",", "."));
		GerenciaEmprestimo gerencia = new GerenciaEmprestimo();
		Double emprestimo = gerencia.calculaEmprestimo(cargo, salario);
		JOptionPane.showMessageDialog(null, "O valor do emprestimo: " + emprestimo);
	}

}
