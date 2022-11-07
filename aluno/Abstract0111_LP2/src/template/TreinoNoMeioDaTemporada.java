package template;

public class TreinoNoMeioDaTemporada extends Treinos {
	void preparoFisico() {
		System.out.println("Preparo Fisico Intenso");
	}

	void jogoTreino(){
		System.out.println("Jogo Treino com Equipe Reserva");
	}

	@Override
	void treinofinal() {
		// TODO Auto-generated method stub
		System.out.println("Treino Final com a Equipe antes do jogo");
	}
}
