
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario func = new Funcionario();
		
		func.setNome("Pablo Lauro");
		func.setCpf("256365489-9");
		func.setSalario(2600.00);
		
		System.out.println(func.getNome());
		System.out.println(func.getBonificacao());
		
		
		
		Gerente g1 = new Gerente();
		
	
		g1.setNome("Ronaldo");
		g1.setCpf("145356987-91");
		g1.setSalario(5000);
		g1.setSenha(12346);
		
		System.out.println("--------------");
		System.out.println("GERENTE");
				
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		System.out.println(g1.autentica(123456));
		System.out.println(g1.getBonificacao());
		
		

	}

}
