package br.unifor.poo.exercicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGerenciaEmprestimo {

	@Test
	public void testCalculoEmprestimoParaDiretor() {
		GerenciaEmprestimo gerencia = new GerenciaEmprestimo();
		assertEquals(30.0, gerencia.calculaEmprestimo(1, 100.0), 0);
	}
	
	@Test
	public void testCalculoEmprestimoParaGerente() {
		GerenciaEmprestimo gerencia = new GerenciaEmprestimo();
		assertEquals(25.0, gerencia.calculaEmprestimo(2, 100.0), 0);
	}
	
	@Test
	public void testCalculoEmprestimoParaOperacional() {
		GerenciaEmprestimo gerencia = new GerenciaEmprestimo();
		assertEquals(20.0, gerencia.calculaEmprestimo(3, 100.0), 0);
	}
	
	@Test
	public void testCalculoEmprestimoValorInvalido() {
		GerenciaEmprestimo gerencia = new GerenciaEmprestimo();
		assertNull(gerencia.calculaEmprestimo(4, 100.0));
	}

}
