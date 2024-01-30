package herdadoConta;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContasCriadas;

	public Conta(int agencia, int numero) {
		Conta.totalContasCriadas++;
		System.out.println("Total de contas criadas: " + Conta.totalContasCriadas);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor negativo.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (numero <= 0) {
			System.out.println("Não pode valor negativo.");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return totalContasCriadas;
	}

}