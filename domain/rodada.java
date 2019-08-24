package domain;

public class rodada extends dominio implements iRodada {

	private static int maxPalavra = 3;
	private static int maxErro = 10;
	private static int PontosQuandoDescobreTodasAsPalavras = 100;
	private static int PontosPorLetraEncoberta = 15;
	private jogador jogador;
	private Class<iPalavra[]>[] palavras;
	private iBoneco boneco;
	private iItem itens[];
	
	public rodada(long id , Class<iPalavra[]>[] palavras, jogador jogador, iBoneco boneco) {
		super(id);
		this.palavras = palavras;
		this.jogador =  jogador;
		this.boneco = boneco;
		
	}
	public rodada(long id , iItem itens[], jogador jogador, iBoneco boneco) {
		super(id);
		this.itens = itens;
		this.jogador =  jogador;
		this.boneco = boneco;
		
	}
	public static int  getMaxPalavras() {
		return maxPalavra;
	}
	
	public static void  setMaxPalavras(int max) {
		maxPalavra = max;
	}
	
	public static int  getMaxErros() {
		return maxErro;
	}
	public static void  setMaxErros(int max) {
		maxErro = max;
	}
	public static int  getPontosQuandoDescobreTodasAsPalavras() {
		return PontosQuandoDescobreTodasAsPalavras;
	}
	public static void  setPontosQuandoDescobreTodasAsPalavras(int pontos) {
		PontosQuandoDescobreTodasAsPalavras = pontos;
	}
	public static int  getPontosPorLetraEncoberta() {
		return PontosPorLetraEncoberta;
	}
	public static void  setPontosPorLetraEncoberta(int pontos) {
		PontosPorLetraEncoberta = pontos;
	}

	public iTema getTema() {
		
		return null;
	}


	public iPalavra[] getPalavra() {
		
		return null;
	}

	
	public int getNumPalavra() {
		
		return 0;
	}

	
	public void tentar(char codigo) {
		

	}

	
	public void arriscar(String[] palavra) {
		

	}

	
	public void exibirItens() {
		

	}

	
	public void exibirBonecos() {
		

	}

	
	public void exibirPalavras() {
		

	}

	
	public iLetra[] getTentativas() {
		
		return null;
	}

	
	public iLetra[] getCertas() {
		
		return null;
	}

	
	public iLetra[] getErrada() {
		
		return null;
	}

	
	public int calcularPontos() {
		
		return 0;
	}

	
	public boolean encerrou() {
		
		return false;
	}

	
	public boolean descobriu() {
		
		return false;
	}

	
	public boolean arriscou() {
		
		return false;
	}

	
	public int getQtdeTentativasRestantes() {
		return 0;
	}

	
	public int getQtdeErros() {
		return 0;
	}

	
	public int getQtdeAcertos() {
		return 0;
	}

	
	public int getQtdeTentativas() {
		return 0;
	}

}
