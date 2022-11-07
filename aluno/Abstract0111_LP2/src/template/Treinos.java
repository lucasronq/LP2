package template;

public abstract class Treinos {
	final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	abstract void preparoFisico();
	abstract void jogoTreino();
	abstract void treinofinal();
	final void treinoTatico() {
		System.out.println("Treino Tatico");
	}
}
