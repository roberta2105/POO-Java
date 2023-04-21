package ProjetoPessoas;

public class projetopessoas {
	public static void main(String[] args) {
		//Programa Principal
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Felipe");
		p2.setNome("Roberta");
		p3.setNome("Roni");
		p4.setNome("Maria");
		
		p1.setSexo("M");
		p4.setSexo("F");
		
		p1.setIdade(19);
		p2.setIdade(19);
		p3.setIdade(40);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}
}