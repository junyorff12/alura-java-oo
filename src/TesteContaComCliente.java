
public class TesteContaComCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Junyorff11");
		cliente.setCpf("222-222-222-22");
		cliente.setProfissao("desenvolvedor Backend Java");
		
		Conta conta = new Conta(123, 1010);
		Conta conta2 = new Conta(123, 1011);

		conta.setTitular(cliente);
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular());
		
		System.out.println(Conta.getTotal());

	}

}
