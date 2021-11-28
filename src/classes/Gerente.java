package classes;

public class Gerente extends Funcionario{
	private double pnl; //Participa��o no Lucros
	
	public Gerente(String nome, int idade, double salario, double pnl) {
		super(nome, idade, salario);
		this.pnl = pnl;
	}
	
	@Override
	public String toString() {
		return "Gerente [pnl: " + pnl + "]";
	}

	public double getPnl() {
		return pnl;
	}

	public void setPnl(double pnl) {
		this.pnl = pnl;
	}

	@Override
	public void calcularSalario() {
		this.salario = this.salario + this.pnl;
	}
	
	@Override
	public void test() {
		System.out.println("Gerente");
	}
}