package interfaces;

public class Preguica implements Animal {
	public void idadeNome() {
		System.out.println("Luan");
	}

	@Override
	public void emitirSom() {
		System.out.println("Ela grita");
	}

	@Override
	public void correr() {
		System.out.println();
	}

	@Override
	public void subirArvore() {
		System.out.println("Luan subindo na árvore");

	}
}
