package ARRAY;

import java.util.Scanner;

public class Exercício_1_Vetores {

	public static void main(String[] args) {
		//criacao de variaveis
		int vet[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int posicao, x, busca = -1;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("|2, 5, 3, 4, 9, 7, 8, 10, 6|");
		System.out.println("\nEscolha um número do Vetor: ");
		posicao = leia.nextInt();
		//validacao do vetor
		for (x = 0; x < 10; x++) {
			if (posicao == vet[x]) {
				busca = x;
			}
		}
		if (busca==-1) {
			System.out.printf("\nO número %d não foi encontrado!", posicao);
		} else {
			System.out.printf("O numero %d está localizado na posição: %d",posicao, busca);
		}

	}

}
