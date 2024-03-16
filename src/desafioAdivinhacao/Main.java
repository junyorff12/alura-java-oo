package desafioAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var random = new Random();
		int opt, num;

		do {
			System.out.println("Jogo da adivinhação!");
			System.out.println("digite 1 para iniciar!");
			System.out.println("digite -1 para sair!");
			opt = sc.nextInt();
			
			switch (opt) {
			case 1:
				System.out.print("Digite o numero: ");
				num = sc.nextInt();
				verificarNumeroAleatorio(num, random);
				break;
			case -1:
				System.out.println("Saindo!!");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}

		} while (opt != -1);

		sc.close();
	}

	public static void verificarNumeroAleatorio(int numDigitado, Random random) {
		int randonNum = random.nextInt(101);
		if (numDigitado == randonNum) {
			System.out.println("Parabéns!!!!");
			System.out.println("numero aleatorio " + randonNum);
		} else {
			System.out.println("Errrrou!!!!!!!!!!");
			System.out.println("numero aleatorio " + randonNum);
		}
	}
}
