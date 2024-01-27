package heranca;

public class TesteGerente {

	public static void main(String[] args) {

		Gerente gerente1 = new Gerente();
		gerente1.setCpf("333333333");
		gerente1.setNome("FF12");
		gerente1.setSalario(5000.0);

		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());

		gerente1.setSenha(222);
		String status = gerente1.autentica(222) ? "Sim!" : "Não!";
		System.out.println("Autenticado? " + status);
		System.out.println(gerente1.getBonificacao());

	}

}
