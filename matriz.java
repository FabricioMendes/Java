package guitPackage;

public class matriz {

	public static void main(String args[]) {

		int[][] vendas = { { 40, 32, 30 }, { 20, 26 }, { 10, 4, 18, 40 } };
		for (int i = 0; i < vendas.length; i++) {
			System.out.print("Vendedor " + i + ": ");
			for (int j = 0; j < vendas[i].length; j++) {
				System.out.print(vendas[i][j]);
				System.out.print(" ");
			}

		}
		System.out.println();
	}
}
