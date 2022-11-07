package genericExemplo;

public class Main {
	public static void main(String[] args) {
		ImprimirInteger impressaoI1 = new ImprimirInteger(777);
		impressaoI1.imprimir();
		
		ImprimirDouble impressaoD1 = new ImprimirDouble(777.77);
		impressaoD1.imprimir();
		
		ImprimirString impressaoS1 = new ImprimirString("IFSP");
		impressaoS1.imprimir();
		
		ImprimirGenerico<Integer> impressaoIG1 = new ImprimirGenerico<>(777);
		impressaoIG1.imprimir();
		
		ImprimirGenerico<Double> impressaoDG1 = new ImprimirGenerico<>(777.77);
		impressaoDG1.imprimir();
		
		ImprimirGenerico<String> impressaoSG1 = new ImprimirGenerico<String>("IFSP");
		impressaoSG1.imprimir();
	}
}
