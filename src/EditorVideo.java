//Gerente herda do Funcionário
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		return super.getBonificacao() + 200.0;
	}	
	
	
}
