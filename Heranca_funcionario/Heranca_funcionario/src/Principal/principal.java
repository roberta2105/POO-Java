package Principal;

import pessoas.Assistente;
import pessoas.Diretor;
import pessoas.Funcionario;
import pessoas.Gerente;
import pessoas.OperadorCaixa;

public class principal {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000.00);
		System.out.println("A bonificação do funcionário é de: " + funcionario.getBonificacao());
		
		OperadorCaixa opc = new OperadorCaixa();
		opc.setSalario(2000.00);
		System.out.println("A bonificação do Operador de Caixa é de: " + opc.getBonificacao());
		
		Assistente assistente = new Assistente();
		assistente.setSalario(2000.00);
		System.out.println("A bonificação do Assistente é de: " + assistente.getBonificacao());
		
		Gerente gerente = new Gerente();
		gerente.setSalario(2000.00);
		System.out.println("A bonificação do Gerente é de: " + gerente.getBonificacao());
		
		Diretor diretor = new Diretor();
		diretor.setSalario(2000.00);
		System.out.println("A bonificação do Diretor é de: " + diretor.getBonificacao());
		
	
	}
}
		
