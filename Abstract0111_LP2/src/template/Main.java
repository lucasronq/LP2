package template;

public class Main {
	public static void main(String[] args) {
		Treinos inicio = new TreinoNoInicioDaTemporada();
		inicio.treinoDiario();
		inicio.treinofinal();
		
		System.out.println("============");
		
		Treinos meio = new TreinoNoMeioDaTemporada();
		meio.treinoDiario();
		meio.treinofinal();
	}
}
