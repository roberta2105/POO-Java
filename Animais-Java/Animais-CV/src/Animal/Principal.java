package Animal;

public class Principal {
	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		r.dormir();
		r.longividade();
		
		m.setPeso(60.3f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();

	Lobo l = new Lobo();
		l.emitirSom();
	
		Cachorro c = new Cachorro();
		c.emitirSom();
	}

}
