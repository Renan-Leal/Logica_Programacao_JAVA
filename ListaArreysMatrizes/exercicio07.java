package ListaArreysMatrizes;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] matrizInicial = new int[3][3];
		int[][] matrizResultado = new int[3][3];

		System.out.print("Digite um n�mero: ");
		int num = input.nextInt();

		System.out.println("\nPREENCHENDO MATRIZ INICIAL: ");
		for (int i = 0; i < matrizInicial.length; i++) {
			for (int j = 0; j < matrizInicial.length; j++) {
				System.out.print("Informe o valor da posi��o [" + i + "][" + j + "]: ");
				matrizInicial[i][j] = input.nextInt();
			}
		}
		System.out.println("\nMATRIZ INICIAL: ");
		for (int i = 0; i < matrizInicial.length; i++) {
			for (int j = 0; j < matrizInicial.length; j++) {
				System.out.print(matrizInicial[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nMATRIZ RESULTADO: ");
		for (int i = 0; i < matrizInicial.length; i++) {
			for (int j = 0; j < matrizInicial.length; j++) {
				matrizResultado[i][j] = matrizInicial[i][j] * num;
				System.out.print(matrizResultado[i][j] + " ");
			}
			System.out.println();
		}
	}

}
