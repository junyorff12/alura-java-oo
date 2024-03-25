package herdadoConta.br.com.bytebank.banco.teste;

import herdadoConta.br.com.bytebank.banco.modelo.ContaCorrente;
import herdadoConta.br.com.bytebank.banco.modelo.ContaPoupanca;
import herdadoConta.br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteHeranca {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cp.saldo = 99.9;

		cc.transfere(50.0, cp);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
