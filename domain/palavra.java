package domain;

import factory.iLetraFactory;

public class palavra extends dominio implements iPalavra {

	private String palavra;
	private iLetraFactory factory;
	private iTema tema;

	public palavra(long id, String palavra, iTema tema, iLetraFactory factory) {
		super(id);
		this.palavra= palavra;
		this.tema = tema;
		this.factory = factory;
	}

	
	public iLetra[] getLetras() {
		return null;
		
	}

	
	public iLetra getLetras(int posicao) {
		return null;
		
	}

	
	public void exibir() {
		System.out.println(this.toString());

	}

	
	public void exibir(boolean posicoes[]) {
		int i = 0;
		for(boolean condicao : posicoes) {
			if(condicao) {
				System.out.println(this.getLetras(i));
			}else {
				System.out.println('*');
			}
		}
		
	}

	
	public int[] tentar(char codigo) {
		
		return null;
	}

	
	public iTema getTema() {
		
		return this.tema;
	}

	
	public boolean comparar(String palavra_arriscada) {
		if(this.palavra.equals(palavra_arriscada)) {
			return true;
		}else {
			return false;
		}
		
	}

	
	public int getTamanho() {
		
		return palavra.length();
	}
	public String toString() {
		return this.palavra;
	}
}
