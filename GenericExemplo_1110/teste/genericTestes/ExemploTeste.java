package genericTestes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import genericExemplo.ImprimirDouble;
import genericExemplo.ImprimirGenericJoker;
import genericExemplo.ImprimirGenerico;
import genericExemplo.ImprimirInteger;
import genericExemplo.ImprimirString;

import java.util.ArrayList;
import java.util.List;

class ExemploTeste {

	@Test
	void test01() {
		ImprimirInteger impressaoI1 = new ImprimirInteger(777);
		impressaoI1.imprimir();
	}
	
	@Test
	void test02() {
		ImprimirDouble impressaoD1 = new ImprimirDouble(777.77);
		impressaoD1.imprimir();
	}
	
	@Test
	void test03() {
		ImprimirString impressaoS1 = new ImprimirString("IFSP");
		impressaoS1.imprimir();
	}
	
	@Test
	void test04() {
		ImprimirGenerico<Integer> impressaoIG1 = new ImprimirGenerico<>(777);
		impressaoIG1.imprimir();
	}
	
	@Test
	void test05() {
		ImprimirGenerico<Double> impressaoDG1 = new ImprimirGenerico<>(777.77);
		impressaoDG1.imprimir();
	}
	
	@Test
	void test06() {
		ImprimirGenerico<String> impressaoSG1 = new ImprimirGenerico<String>("IFSP");
		impressaoSG1.imprimir();
	}
	
	@Test
	void test07() {
		List<Integer> intList = new ArrayList<>();
		intList.add(2022);
		ImprimirGenericJoker.imprimir(intList);
	}
	
	@Test
	void test08() {
		List<Double> intList = new ArrayList<>();
		intList.add(2022.10);
		ImprimirGenericJoker.imprimir(intList);
	}
	
	@Test
	void test09() {
		List<String> intList = new ArrayList<>();
		intList.add("Feliz Dia Das Crianças!!!");
		ImprimirGenericJoker.imprimir(intList);
	}

}
