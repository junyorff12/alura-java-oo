package pilhaDeExecucao;

public class TestaConexao {

	public static void main(String[] args) throws Exception {

		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro...");
		}
	}
}
