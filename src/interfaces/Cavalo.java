package interfaces;

public class Cavalo implements Animal {

	public void idadeNome() {
		System.out.println("P� de pano");
	}

	@Override
	public void emitirSom() {
		System.out.println("Relinchando");
	}

	@Override
	public void correr() {
		System.out.println("Est� galopando");
	}

	@Override
	public void subirArvore() {

	}
}
