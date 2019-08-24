package domain;

public interface iRodada extends iDominio {
	
	public iTema getTema();
	public iPalavra[] getPalavra();
	public int getNumPalavra();
	public void tentar(char codigo);
	public void arriscar(String palavra[]);
	public void exibirItens();
	public void exibirBonecos();
	public void exibirPalavras();
	public iLetra[] getTentativas();
	public iLetra[] getCertas();
	public iLetra[] getErrada();
	public int calcularPontos();
	public boolean encerrou();
	public boolean descobriu();
	public boolean arriscou();
	public int getQtdeTentativasRestantes();
	public int getQtdeErros();
	public int getQtdeAcertos();
	public int getQtdeTentativas();
}
