
public class TesteContaComCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Junyorff12";
		cliente.cpf = "222-222-222-22";
		cliente.profissao = "desenvolvedor Backend Java";
		
		Conta conta = new Conta();
		conta.titular = cliente;
		
		System.out.println(conta.titular.nome);
		System.out.println(conta.titular);

	}

}
