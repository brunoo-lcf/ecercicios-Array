package ARRAY;

import java.util.Scanner;

public class Exercicio_4_Matrizes {

	public static void main(String[] args) {

		float[][] notas = new float[10][4];
		int linha = 0, coluna = 0;
		float soma = 0;
		
		float[] mediaAluno = new float [10];

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 10; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				System.out.println("\nDigite a nota do "+(linha+1)+" aluno: ");
				notas[linha][coluna] = leia.nextFloat();
				soma += notas[linha][coluna];
			}
			
			mediaAluno[linha] = soma / 4;
			soma = 0;
			System.out.printf("\nA média do aluno é: %.1f\n",mediaAluno[linha]);
			
		}for (int i = 0; i < mediaAluno.length; i++) {
			System.out.printf("\nMédia do aluno %d: %.1f",(i+1),mediaAluno[i]);
			
		}

	}

}
