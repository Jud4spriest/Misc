package teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Baralho{
	
	
	public static void main(String[] args) {
			
		List<Carta> baralho = new ArrayList<Carta>();
		for(int i=1 ; i<=12 ; i++) {
				for(int j=1 ; j<=4 ; j++) baralho.add(new Carta(i,j));
		}
	
		System.out.println("Baralho Criado --> "+baralho.toString());
		Collections.shuffle(baralho);
		System.out.println("Baralho Embaralhado --> "+baralho.toString());
		Collections.sort(baralho);
		System.out.println("Baralho Ordenado (Crescente) --> "+baralho.toString());
		
		Carta key = new Carta(3,3);
		int res = Collections.binarySearch(baralho, key);
		System.out.println("A carta "+key+" está na posição "+(res)+" do baralho.");
	
	
	}
}

