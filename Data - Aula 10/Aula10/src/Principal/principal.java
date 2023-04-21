package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;


public class principal{
	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		
		System.out.println("Date antes de formatar: " + date);
		System.out.println("Date depois de formatar: " + simpleDateFormat.format(date));
	
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		String stx = "14/04/2023 14:30:34";
//		Date dataUsuario = simpleDateFormat.parse(stx);
//		System.out.println("Date digitado e formatado: " + dataUsuario);
		
		LocalDate hoje = LocalDate.now();
		System.out.println("LocalDate antes de formatar: " + hoje);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String hojeFormatado = hoje.format(formatter);
		System.out.println("LocalDate depois de formatar: " + hojeFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println("LocalDateTime antes de formatar: " + agora);
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String agoraFormatado = agora.format(formatter);
		System.out.println("LocalDateTime depois de formatar: " + agoraFormatado);
		
		GregorianCalendar calendar = new GregorianCalendar();
		
		//Mostra qual o dia da semana 1 = domingo, 2=segunda, etc
		System.out.println(calendar.get(calendar.DAY_OF_WEEK));
		
		//Adiciona 2 meses à data atual
//		System.out.println(calendar.add(calendar.MONTH, 2));
		
		//Imprime falso. 2009 não é bissexto.
		System.out.println(calendar.isLeapYear(2020));
		
		//Atribui a data do GregorianCalendar à uma variável Date
		Date d1 = calendar.getTime();
		
		//Armazena a data de d1 para o GregorianCalendar gc.
		calendar.setTime(d1);
	}
}






































