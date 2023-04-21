package Animal;

public class Reptil extends animal implements Habitos {
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de reptil");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void dormir() {
		System.out.println("3 horas por dia.");
		
	}

	@Override
	public void longividade() {
		System.out.println("Vive em média 8 anos.");
		
	}

}
