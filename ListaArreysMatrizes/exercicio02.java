package ListaArreysMatrizes;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean verificador = false;
		int[] valores = new int[10];

		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite o " + i + "° valor: ");
			valores[i] = input.nextInt();

		}
		System.out.print("Digite um novo valor: ");
		int valor = input.nextInt();
		for (int i = 0; i < valores.length; i++) {

			if (valor == valores[i]) {
				verificador = true;

			}

		}
		if (verificador == true) {
			System.out.print("ACHEI");

		} else {
			System.out.print("NÃO ACHEI");

		}

	}

}
