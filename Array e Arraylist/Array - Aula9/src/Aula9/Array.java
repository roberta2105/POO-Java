package Aula9;

public class Array extends Exception {
	public static void main(String args[]) {
		
		int [] num = new int [5];
		num[0]=(0);
		num[1]=(2);
		num[2]=(4);
		num[3]=(6);
		num[4]=(8);
		
		//Sequência em ordem crescente.
		//Tratamento de erro.
		
		System.out.println("--------------------------------");
		
		for(int i=0; i<5; i++) {
			System.out.println("A sequência em ordem crescente é: "+num[i]);}
		System.out.println("--------------------------------");
		
		
		try {
			System.out.println(num[8]);
		
		}catch (Exception e) {
			System.out.println("ERRO! "+e.getMessage());
		}System.out.println("--------------------------------");
		
		//Sequência em ordem decrescente.
		
		for(int i=4; i>=0; i--) {
			System.out.println("A sequência em ordem decrescente é: "+num[i]);}
			System.out.println("--------------------------------");
		
	}
}