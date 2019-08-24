package domain;

public interface iPalavra extends iDominio {
	public iLetra[] getLetras();
	public iLetra getLetras(int posicao);
	public void exibir();
	public void exibir(boolean posicoes[]);
	public int[] tentar(char codigo);
	public iTema getTema();
	public boolean comparar(String palavra_arriscada);
	public int getTamanho();
	public String toString();
	

}
