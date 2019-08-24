package domain;

public interface iItem extends iDominio {
	public iPalavra getPalavra();
	public iLetra getLetraDescobertas();
	public int qtdeLetrasEncobertas();
	public int CalcularPontosLetrasEncobertas(int ValorPorLetraEncoberta);
	public boolean descobriu();
	public void exibir();
	public boolean tentar(char codigo);
	public void arriscar(String palavra);
	public String getPalavraArriscada();
	public boolean arriscou();
	public boolean acertou();

}
