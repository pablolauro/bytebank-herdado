//Gerente herda do Funcionario
public class Gerente extends Funcionario implements Autenticavel {
	private int senha;
	
    //novo m�todo, recebendo dois params
    public boolean autentica(String login, int senha) {
        return true;
    }	
	
	public double getBonificacao() {
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}	
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.senha = senha;		
	}
	
	
}
