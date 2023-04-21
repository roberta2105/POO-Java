package Principal;

import java.io.IOException;
import IO.LeituraEscrita;

public class principal{
	public static void main(String[] args) throws IOException{
		
		LeituraEscrita.escritor(".\\teste");
		LeituraEscrita.leitor(".\\teste\\Nomes.txt");
	}
}