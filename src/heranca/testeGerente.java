package heranca;

public class testeGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setCpf("333333333");
		g1.setNome("FF12");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(222);
//		boolean autenticado = g1.autentica(222);
		String status = g1.autentica(222) ? "Sim!" : "Não!";
		System.out.println("Autenticado? " + status);
		System.out.println(g1.getBonificacao());
	}

} 
