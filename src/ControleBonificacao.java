
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario func) {
		soma += func.getBonificacao();
	}

	public double getSoma() {
		return soma;
	}
}
