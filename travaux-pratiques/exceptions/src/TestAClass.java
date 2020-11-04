
public class TestAClass {
	public static void main(String[] args) {
		AClass obj = new AClass();

		////////////////////////////////////////////////////////////
		System.out.println("-- appel de f dans main --");
		try {
			obj.f();
		}
		catch(Exception e) {
			System.out.println("récupération dans main : " + e); // Récupere les erreurs à partir de la méthode qui a été appelée
			e.printStackTrace(); // Imprime les lignes exactes ou se trouvent les erreurs
		}
		System.out.println();

		////////////////////////////////////////////////////////////
		System.out.println("-- appel de g dans main --");
		try {
			obj.g();
		}
		catch(Exception e) {
			System.out.println("récupération dans main : " + e);
			e.printStackTrace();
		}
		System.out.println();
		////////////////////////////////////////////////////////////
		System.out.println("-- appel de h dans main --");
		try {
			obj.h();
		}
		catch(Exception e) {
			System.out.println("récupération dans main : " + e); // Pouquoi il n'y a pas eu de récuperation dans le main ?
			e.printStackTrace();
		}
		System.out.println();

		////////////////////////////////////////////////////////////
		System.out.println("-- appel de r dans main --");
		try {
			obj.r();
		}
		catch(Exception e) {
			System.out.println("récupération dans main : " + e);
			e.printStackTrace();
		}
	}
}