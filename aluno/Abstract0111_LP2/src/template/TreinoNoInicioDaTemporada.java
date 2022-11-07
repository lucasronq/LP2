package template;

public class TreinoNoInicioDaTemporada extends Treinos {
	void preparoFisico() {
		System.out.println("Preparo Fisico Leve.");
	}

	void jogoTreino() {
		System.out.println("Jogo Treino com Equipe Junior.");
	}

	@Override
	void treinofinal() {
		// TODO Auto-generated method stub
		System.out.println("Treino Final com a Equipe antes do jogo");
		
	}
}
