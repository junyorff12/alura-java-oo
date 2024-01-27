package heranca;

public class TestaReferencias {

	public static void main(String[] args) {
		
		Designer d = new Designer();
		d.setNome("Emanuel");
		d.setSalario(2000.0);

		EditorVideo ev = new EditorVideo();
		ev.setNome("Jhos");
		ev.setSalario(5000.0);
		
		Gerente g = new Gerente();
		g.setNome("EU");
		g.setSalario(7000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(d);
		controle.registra(ev);
		
		System.out.println("Soma das bonificacoes: " + controle.getSoma());
		
		
	}

}
