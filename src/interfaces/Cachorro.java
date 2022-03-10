package interfaces;

public class Cachorro implements Animal {

	public void idadeNome() {
		System.out.println("Ele se cham Genilson");
	}

	@Override
	public void emitirSom() {
		System.out.println("Está latindo");
	}

	@Override
	public void correr() {
		System.out.println("correndo");
	}

	@Override
	public void subirArvore() {
	}

}
