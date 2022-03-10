package interfaces;

public class Cavalo implements Animal {

	public void idadeNome() {
		System.out.println("Pé de pano");
	}

	@Override
	public void emitirSom() {
		System.out.println("Relinchando");
	}

	@Override
	public void correr() {
		System.out.println("Está galopando");
	}

	@Override
	public void subirArvore() {

	}
}
