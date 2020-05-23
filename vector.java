package guitPackage;

import java.util.Scanner;

public class vector {

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a quantidade de jogadores: ");
		int n = teclado.nextInt();
		String[] equipe = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome do jogador " + i + ": ");
			equipe[i] = teclado.next();
		}
		for (int i = 0; i < n; i++)
			System.out.print(equipe[i] + ", ");
	}
}