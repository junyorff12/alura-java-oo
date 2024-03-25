package herdadoConta.br.com.bytebank.banco.teste;

import herdadoConta.br.com.bytebank.banco.modelo.CalculadorImposto;
import herdadoConta.br.com.bytebank.banco.modelo.ContaCorrente;
import herdadoConta.br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida sg = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(sg);
		
		System.out.println(calc.getTotalImposto());
	}

}
