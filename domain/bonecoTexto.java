package domain;

public class bonecoTexto implements iBoneco {

	@Override
	public void exibir(int partes) {
		switch(partes) {
		  case 1:
		   		System.out.println("cabe�a");
		    break;
		  case 2:
			  System.out.println("cabe�a, olho esquerdo");
		    break;
		  default:
		    // code block
		}

	}

}
