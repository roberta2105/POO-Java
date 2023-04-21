package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeituraEscrita{
	private static final boolean String = false;

	public static void escritor(String path) throws IOException{
		System.out.println("Escreva o nome do arquivo com extensão ");
		Scanner in = new Scanner (System.in);
		String pathCompleto = (path + "\\" + in.nextLine());
		
		System.out.println("Escreva o conteúdo do arquivo");
		String linha = in.nextLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter(pathCompleto)); 
		bw.append(linha);
		bw.close();
		in.close();
		System.out.println("Arquivo salvo com sucesso");
	}
	
	public static void leitor(String path) throws IOException{
		BufferedReader br = new BufferedReader (new FileReader(path));
		
		while (true) {
			String linha = br.readLine();
			if(linha != null) {
				System.out.println(linha);
			} else {
				break;
			}	
		}
		br.close();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void escritor(String path) throws IOException{
//		//path> endereço onde irá salvar o arquivo
//		
//		//Solicitar que o usuário digite o nome do arquivo
//		System.out.println("Escreva o nome do arquivo com extensão: ");
//		Scanner in = new Scanner(System.in);
//		String pathCompleto = path + "\\" + in.nextLine();
//		
//		//pathCompleto> endereço onde irá salvar o arquivo +
//		//o nome do arquivo.
//		
//		//Capturar escrita no terminal que será usada para
//		//escrever no arquivo.
//		System.out.println("Escreva o conteúdo do arquivo");
//		String linha = in.nextLine();
//		
//		//Escrever o conteúdo do arquivo e salvá-lo no disco
//		BufferedWriter bw = new BufferedWriter(new FileWriter(pathCompleto));
//		bw.append(linha);
//		bw.close();
//		in.close();
//		
//		System.out.println("Arquivo salvo com sucesso");
//	}
//	public static void leitor(String path) throws IOException{
//		BufferedReader br = new BufferedReader(new FileReader(path));
//		while(true){
//			String linha = br.readLine();
//			if(linha != null) {
//				System.out.println(linha);
//			}
//			else {
//				break;
//		}
//	}
//		br.close();
//	}
