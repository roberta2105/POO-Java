package EnumsJava;
import java.util.Scanner;


public class EnumsMain extends Exception{
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		String planeta;
		
		for(EnumPlanetas p : EnumPlanetas.values()) {
			System.out.println(p);
		
			System.out.println("Para qual planeta você deseja viajar?");
			planeta = entrada.next();
			entrada.close();
			
			Enumteste pl = new Enumteste(planeta);
			pl.viajarPlaneta();	
		}
		
			
		
	}
}