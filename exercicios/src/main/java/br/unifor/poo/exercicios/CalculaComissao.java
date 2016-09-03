package br.unifor.poo.exercicios;

import javax.swing.JOptionPane;
/**
 * Questao 04 da lista de exercícios
 * */
public class CalculaComissao {

	public Double calculaComissao(double valorDespesa) {
		return valorDespesa * 0.1;
	}

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Informe o valor da despesa: ");
		Double valorDespesa = Double.parseDouble(entrada.replace(",", "."));
		CalculaComissao calcula = new CalculaComissao();
		Double comissao = calcula.calculaComissao(valorDespesa);
		JOptionPane.showMessageDialog(null, "O valor da comissão é: " + comissao, "Garçon Comissão",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
