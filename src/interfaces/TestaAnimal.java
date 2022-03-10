package interfaces;

public class TestaAnimal {
	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();

		dog.idadeNome();
		dog.correr();
		dog.emitirSom();

		System.out.println();

		cavalo.idadeNome();
		cavalo.correr();
		cavalo.emitirSom();

		System.out.println();

		preguica.idadeNome();
		preguica.subirArvore();
		preguica.emitirSom();
	}

}
