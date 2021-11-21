package test;

import classes.Gerente;
import classes.Relatorio;
import classes.Vendedor;

public class Test {
	public static void main(String[] args) {
		
		Gerente g = new Gerente("Roberto", 40, 5000, 2000);
		Vendedor v = new Vendedor("Marcos", 30, 2000, 20000);
		Relatorio relatorio = new Relatorio();
		
		relatorio.gerarRelatorioGenerico(g);
		System.out.println("================");
		relatorio.gerarRelatorioGenerico(v);
		
		@SuppressWarnings("unused")
		double Double = 3.0;
		float Float = 3.0f;
		
		Double = Float;
	}
}
