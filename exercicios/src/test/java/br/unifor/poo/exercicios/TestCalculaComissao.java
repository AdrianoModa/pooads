package br.unifor.poo.exercicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculaComissao {

	@Test
	public void testCalculaComissao() {
		CalculaComissao calcula = new CalculaComissao();
		assertEquals(10.0, calcula.calculaComissao(100.0), 0);
	}

}
