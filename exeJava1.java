package guitPackage;

import java.util.Scanner;

public class exeJava1 {
	
	public static void main(String args[]) {
	
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = teclado.next();
		System.out.print("Digite o número de vezes : ");
		int n = teclado.nextInt();
		int i = 0;
		while (i < n) {
			i = i + 1;
			System.out.println("Vez " + i + ": " + nome);
		}
		System.out.println("Fim do programa");
	}
}