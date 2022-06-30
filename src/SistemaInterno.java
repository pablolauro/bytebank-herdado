
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		if (fa.autentica(senha)) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Senha inválida");
		}
		
	}
}
