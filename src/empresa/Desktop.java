package empresa;

public class Desktop extends Computador {
	public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
		super(gbMemoria, numProcessadores);
		this.acessorios = acessorios;
	}
	//eu preciso implementar os metods abstratos 
	double acessorios;
	@Override
	double cauculaValor() {
		
		double total = 200*gbMemoria +400*numProcessadores+acessorios;
		return total;
	}
}
