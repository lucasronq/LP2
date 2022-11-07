package genericExemplo;

public class ImprimirGenerico<T> {
	T algoParaImprimir;
	
	public ImprimirGenerico(T algoParaImprimir) {
		this.algoParaImprimir = algoParaImprimir;
	}
	
	public void imprimir() {
		System.out.println(algoParaImprimir);
	}
}
