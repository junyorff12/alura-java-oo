package herdadoConta.br.com.bytebank.banco.modelo;

public abstract class Conta {

	public double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContasCriadas;

	public Conta(int agencia, int numero) {
		
		if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }

		
		Conta.totalContasCriadas++;
		System.out.println("Total de contas criadas: " + Conta.totalContasCriadas);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo " + this.saldo + ", Valor: " + valor);
		}
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	
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