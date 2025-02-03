package empresa;

public abstract class Computador {

	public Computador(int gbMemoria, int numProcessadores) {
		super();
		this.gbMemoria = gbMemoria;
		this.numProcessadores = numProcessadores;
	}

	int gbMemoria;
	int numProcessadores;
	
	abstract double cauculaValor();
	
}
