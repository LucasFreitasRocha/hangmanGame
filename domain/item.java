package domain;

public class item extends dominio implements iItem {

	private iPalavra palavra;
	private  boolean posicoesDescobertas[]; 

	public item(long id, iPalavra palavra) {
		super(id);
		this.palavra = palavra;
		int n = palavra.getTamanho();
		this.posicoesDescobertas = new boolean[n];
		for(int i= 0; i<n;i++) {
			this.posicoesDescobertas[i] =false;
		}
	}

	@Override
	public iPalavra getPalavra() {
		// TODO Auto-generated method stub
		return this.palavra;
	}

	@Override
	public iLetra getLetraDescobertas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int qtdeLetrasEncobertas() {
		int i=0;
		for(boolean condicao : this.posicoesDescobertas) {
			if(!condicao) {
				i++;
			}
		}
		return i;
	}

	@Override
	public int CalcularPontosLetrasEncobertas(int ValorPorLetraEncoberta) {
		int total = 0;
		for(boolean condicao:this.posicoesDescobertas) {
			if(condicao) {
				total += ValorPorLetraEncoberta;
			}
		}
		return total;
	}

	@Override
	public boolean descobriu() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void exibir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tentar(char codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void arriscar(String palavra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPalavraArriscada() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean arriscou() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean acertou() {
		// TODO Auto-generated method stub
		return false;
	}

}
