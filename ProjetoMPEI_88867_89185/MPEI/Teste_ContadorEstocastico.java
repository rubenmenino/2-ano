package ProjetoMPEI_88867_89185.MPEI;

import java.util.*;

public class Teste_ContadorEstocastico {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int probabilidade = 0;
		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("N�mero de vezes a incrementar: ");
			numero = sc.nextInt();
			System.out.print("Probabilidade de incrementar (entre 1 e 99): ");
			probabilidade = sc.nextInt();
		} while(probabilidade < 1 || probabilidade > 99);
		
		ContadorEstocastico teste = new ContadorEstocastico(probabilidade);
		
		for(int i=0 ; i<numero ; i++) {
			teste.incrementar();
		}
		
		System.out.print("Contador estocastico de " + numero + " vezes, com probabilidade de incrementar de " + probabilidade +
						 "%, ap�s ser multiplicado por " + (double)100/probabilidade + ": " + (teste.contador() * 100/probabilidade) );
		
	}

}
