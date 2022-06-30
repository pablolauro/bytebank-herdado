public class TesteSistemaInterno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador a = new Administrador();
		a.setSenha(1111);
		
		
		Cliente c = new Cliente();
		c.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(a);
		si.autentica(c);
		
	}

}
