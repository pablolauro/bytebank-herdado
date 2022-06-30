
public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente();
		EditorVideo ev = new EditorVideo();
		Designer d1 = new Designer();
		
		ev.setNome("Kiko");
		g1.setNome("Blumenal");
		d1.setNome("Avarildo");
		g1.setSalario(5000.0);
		ev.setSalario(1000.0);
		d1.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d1);
		
		
		
		System.out.println(controle.getSoma());
		System.out.println("----Bonificação Designer----");
		System.out.println(d1.getBonificacao());
		

	}

}
