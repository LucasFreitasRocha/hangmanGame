package domain;

public class tema  extends dominio implements iTema {

	private String nome;

	tema(long id, String nome){
		super(id);
		this.nome= nome;
	}
	public long getId() {
		return id;
	}


	public String getNome() {
		return this.nome;
	}


	public void setNome(String nome) {
		this.nome= nome;
	}

}
