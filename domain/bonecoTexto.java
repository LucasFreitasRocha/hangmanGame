package domain;

public class bonecoTexto implements iBoneco {

	@Override
	public void exibir(int partes) {
		switch(partes) {
		  case 1:
		   		System.out.println("cabeça");
		    break;
		  case 2:
			  System.out.println("cabeça, olho esquerdo");
		    break;
		  default:
		    // code block
		}

	}

}
