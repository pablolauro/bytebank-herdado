//Gerente herda do Funcionário
public class Gerente extends Funcionario {
	
	private int senha;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
    //novo método, recebendo dois params
    public boolean autentica(String login, int senha) {
        return true;
    }	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}	
	
	
}
