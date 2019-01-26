package ProjetoMPEI_88867_89185.MPEI;

import java.util.*;

public class Teste_CountingBloomFilter{
	public static void main(String args[]) {
		CountingBloomFilter filter = new CountingBloomFilter(100,3);
		
		List<String> paises = new ArrayList<>();
		List<String> teste = new ArrayList<>();
		
		// Criar os 4 païses
		paises.add("Portugal");
		paises.add("Espanha");
		paises.add("Alemanha");
		paises.add("Italia");
		
		// Criar 4 païses para testar
		teste.add("Russia");
		teste.add("China");
		teste.add("Italia");
		teste.add("Portugal");
		
		// Inserir os 4 païses no bloom filter
		for(String x : paises.toArray(new String[0])) {
			filter.inserir(x);
		}
		
		// Verificar os 4 païses do teste
		for(String y : teste.toArray(new String[0])) {
			if(filter.verificar(y)) {
				System.out.printf("%s pertence ao conjunto\n", y);
			} else {
				System.out.printf("%s Nao pertence ao conjunto\n", y);
			}
		}
		
		System.out.println("\n\n----------- Agora testar o remove() e o count() ----------\n");
		
		
		// Testar o count() apï¿½s inserir novamente Portugal
		filter.inserir("Portugal");
		System.out.printf("Portugal aparece %d vezes no filter.", filter.count("Portugal"));
		
		
		System.out.print("\n\n");
		// Testar o remove(), removendo Italia e verificando novamente o teste feito anteriormente com os 4 paises da List teste
		filter.remove("Italia");
		for(String y : teste.toArray(new String[0])) {
			if(filter.verificar(y)) {
				System.out.printf("%s pertence ao conjunto\n", y);
			} else {
				System.out.printf("%s Nao pertence ao conjunto\n", y);
			}
		}
		
	}	
}