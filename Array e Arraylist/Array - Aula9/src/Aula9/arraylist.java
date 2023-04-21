package Aula9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class arraylist {

	public static void main(String[] args) {
		
		Set<String> cargos = new HashSet<>();
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Funcionário");
		cargos.add("Diretor"); // repetido!
		
		// imprime na tela todos os elementos
		System.out.println("Os cargos em ordem alfabética são:");
		for(String e:cargos){
			System.out.println(e);}
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3); 
		
		//Imprimir todos os elementos em sequência: 
		System.out.println("----------------------");
		System.out.println("Sequência de números: ");
		
		for(int e:numeros){
			System.out.println(e);
		}System.out.println("----------------------");
		
		//apagar todo o ArrayList:
		//numeros.clear();
				
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Mônica");
		nomes.add("Roberta");
		nomes.add("Mariana");
		nomes.add("Felipe");
		
		System.out.println("Nomes ordenados em ordem alfabética:");
		
		//Imprimir todos os elementos em sequência: 
		
		Collections.sort(nomes);
		
			for(String e:nomes){
					System.out.println(e);
					
		}System.out.println("--------------------------------");
				
		//Remover um item:
//		nomes.remove(3);
		
		System.out.println("Segundo número da ordem alfabética:");
		
		//Imprimir uma posição expecífica:
		System.out.println(nomes.get(1));
		System.out.println("--------------------------------");
		
		//Retorna quantas posições há no arraylist.
		System.out.println("Há "+nomes.size()+" elementos no Arraylist.");
		System.out.println("--------------------------------");
		
		//retorna true se a lista não contém elementos e retorna false se ela contém elementos.
		System.out.println("A lista não possui elementos? "+nomes.isEmpty());
		
		
		
	}

}
