package pessoas;

public class Assistente extends Funcionario {
	
		public double getBonificacao() {
			return super.getBonificacao() +this.getSalario() * 0.05;
		}

		@Override
		public String toString() {
			return "Assistente [getBonificacao()=" + getBonificacao() + ", getNome()=" + getNome() + ", getCPF()="
					+ getCPF() + ", getSalario()=" + getSalario() + ", getNumeroIdentificacao()="
					+ getNumeroIdentificacao() + "]";
		}
		
}
