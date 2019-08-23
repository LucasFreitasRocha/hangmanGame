package domain;

public class jogador extends dominio  {

	private String nome;
	private int pontuacao;
	

	jogador(long id, String nome){
		super(id);
		this.nome = nome;
	}
	jogador(long id, String nome, int pontuacao){
		super(id);
		this.nome = nome;
		this.pontuacao= pontuacao;
	}

	public String getNome() {
		
		return this.nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;

	}

	
	public int getPontuacao() {
		
		return this.pontuacao;
	}

	
	 void setPontuacao(int pontuacao) {
		

	}

}
