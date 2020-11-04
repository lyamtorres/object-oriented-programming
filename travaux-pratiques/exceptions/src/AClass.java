
// une classe pour approfondir et comprendre les exceptions
public class AClass {
	// constructeur
	public AClass() {}

	// méthode f
	public void f() throws Exception {
		System.out.println("début f");

		if (true)
			throw new Exception("erreur dans f");

		System.out.println("fin f");
	}

	// méthode g
	public void g() throws Exception {
		System.out.println("début g");

		f();

		System.out.println("fin g");
	}

	// Récupere et affiche l'exception au niveau de la fonction avec "catch"
	public void h() {
		System.out.println("début h");

		try {
			f();
			System.out.println("après f dans h"); // Pourquoi cette ligne ne s'execute pas ? Parce que dans la ligne prescendante il y avait deja une erreur ?
		}
		catch(Exception e) {
			System.out.println("récupération dans h : " + e);
		}

		System.out.println("fin h");
	}

	public void r() throws Exception {
		System.out.println("début r");

		try {
			g();
			System.out.println("après g dans r");
		}
		catch(Exception e) {
			System.out.println("récupération  dans r : " + e);
			System.out.println("relancement dans r  (cas de traitement incomplet de l'erreur)");
			throw e; // Envoie l'erreur dans le main
		}

		System.out.println("fin r");
	}
}
