package empresa;

public class NoteBook extends Computador {
	
	public NoteBook(int gbMemoria, int numProcessadores, int polegadasTela) {
		super(gbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}

	int polegadasTela;

	@Override
	double cauculaValor() {
		
		double total = 250*gbMemoria+500*numProcessadores + 100*polegadasTela;
		return total ;
	}
	
	
	
}
