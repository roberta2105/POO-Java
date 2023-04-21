package Aula3;
import Aula3.Valores;

public class Principal {
public static void main(String[] args) {
	
	Valores meses = new Valores(23000,17000,10000,15000,18000,19000,20000);

System.out.println("O gasto no mês de janeiro foi: "+meses.jan);
System.out.println("O gasto no mês de fevereiro foi: "+meses.fev);
System.out.println("O gasto no mês de março foi: "+meses.mar);
System.out.println("O gasto no mês de abril foi: "+meses.abr);
System.out.println("O gasto no mês de maio foi: "+meses.mai);
System.out.println("O gasto no mês de junho foi: "+meses.jun);
System.out.println("O gasto no mês de julho foi: "+meses.jul);
}
}