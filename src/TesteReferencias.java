
public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente();
		Funcionario f1 = new Gerente();
		EditorVideo ev = new EditorVideo();
		ev.setNome("Kiko");
		g1.setNome("Blumenal");
		f1.setNome("Avarildo");
		g1.setSalario(5000.0);
		f1.setSalario(4000.0);
		ev.setSalario(1000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(ev);
		
		
		
		System.out.println(controle.getSoma());
		

	}

}
