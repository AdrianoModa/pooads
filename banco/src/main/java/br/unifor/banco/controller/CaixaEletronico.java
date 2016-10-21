package br.unifor.banco.controller;

import br.unifor.banco.entitys.Agencia;
import br.unifor.banco.entitys.Cliente;
import br.unifor.banco.entitys.Conta;
import br.unifor.banco.enums.TipoConta;

public class CaixaEletronico {

	public static void main(String[] args) {
		Agencia agenciaBB = new Agencia("Agencia BB - Pontes Vieira", "6543-3");
		Agencia agenciaBradesco = new Agencia("Agencia Bradesco - Unifor", "123-4");
		Agencia agenciaSantander = new Agencia("Agencia Santander - Santos Dumont");

		Cliente cliente1 = new Cliente("Paulo", "111", true, 29);
		Cliente cliente2 = new Cliente("Maria", "222", true, 59);
		Cliente cliente3 = new Cliente("Antonio", "333", false, 37);

		Conta conta1 = new Conta("123", 3500.00, agenciaBB, cliente1, TipoConta.CORRENTE);
		Conta conta2 = new Conta("456", 7500.00, agenciaBradesco, cliente2, TipoConta.POUPANCA);
		Conta conta3 = new Conta("789", 0.00, agenciaBradesco, cliente3, TipoConta.ESPECIAL);
		
		Cliente.setMaxQtdaBracos(3);
		System.out.println(cliente1.getMaxQtdaBracos());
		System.out.println(cliente2.getMaxQtdaBracos());
		

		

	}

}
