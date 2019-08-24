package factory;

import domain.iLetra;

public interface iLetraFactory {
	public iLetra getLetra(char codigo);
	public iLetra getLetraEncoberta();
}