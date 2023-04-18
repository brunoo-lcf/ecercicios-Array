package ARRAY;

import java.util.Scanner;

public class Exercicio_3_Matrizes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int [][] matriz = new int [3][3];
		int linha,coluna,somaDP=0, somaDS=0;
		String valoresDP="",valoresDS="";
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.printf("\nDigite um número na posição [%d][%d]: ",linha,coluna);
				matriz[linha][coluna]=leia.nextInt();
				
				if(linha == coluna) {
					somaDP += matriz[linha][coluna];
					valoresDP += matriz[linha][coluna]+"";
				}
				
				if(linha+coluna == 2) {
					somaDS += matriz[linha][coluna];
					valoresDS += matriz[linha][coluna]+"";
					
				}
			}
		}
		System.out.println("\nElementos da diagonal principal: "+valoresDP+" ");
		System.out.println("\nElementos da diagonal secundária: "+valoresDS+" ");
		System.out.println("\nSomatório da diagonal principal: "+somaDP+" ");
		System.out.println("\nSomatório da diagonal secundária: "+somaDS+" ");
	}

}
