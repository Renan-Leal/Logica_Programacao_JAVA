package ListaArreysMatrizes;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrizA = new int[4][4];
		int MenorValor = 0;

		// PREENCHENDO MATRIZ A
		System.out.print("MATRIZ A: ");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print("Digite o valor da posição da matriz A[" + i + "][" + j + "]: ");
				matrizA[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				if (MenorValor > matrizA[i][j] || (i == 0 && j == 0)) {
					MenorValor = matrizA[i][j];
				}

			}

		}
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n" + MenorValor);

	}

}
