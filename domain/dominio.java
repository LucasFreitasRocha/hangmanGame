package domain;

public abstract class dominio implements iDominio {
	
	long id;
	 public dominio(long id) {
		 this.id = id;
	 }
	
	public long getId() {
		
		return this.id;
	}

}
