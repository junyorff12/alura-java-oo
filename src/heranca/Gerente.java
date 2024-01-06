package heranca;

public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(senha == this.senha) {
			return true;
		}
		return false;
	}
	
//	public double getBonificacao() {
//		return this.salario * 0.1;
//	}
	

}
