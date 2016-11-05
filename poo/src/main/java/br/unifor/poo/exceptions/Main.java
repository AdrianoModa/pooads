package br.unifor.poo.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File file = new File(System.getProperty("user.home")+"\\teste.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			String linha = null;
			while((linha = br.readLine()) != null){
				System.out.println(linha);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e) {
			System.out.println("Erro ao ler o conteúdo do arquivo");
		} 
	}

}
