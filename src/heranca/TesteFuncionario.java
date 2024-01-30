package heranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Gerente();
		
		f.setNome("jrff12");
		f.setCpf("333333333");
		f.setSalario(6000);
		
		System.out.println(f.getBonificacao());
		System.out.println(f.getSalario());
	}

}
