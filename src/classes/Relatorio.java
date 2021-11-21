package classes;

public class Relatorio {
	
	public void gerarRelatorioGenerico(Funcionario funcionario) {
		funcionario.calcularSalario();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Idade: " + funcionario.getIdade());
		System.out.println("Salario: " + funcionario.getSalario());
		if(funcionario instanceof Gerente) {
			Gerente g = (Gerente) funcionario;
			System.out.println("PNL: " + g.getPnl());
		}
		else if(funcionario instanceof Vendedor) {
			//Cast entre classes...
			Vendedor v = (Vendedor) funcionario;
			//O java so aceita se o Vendedor for filho de funcionario.
			System.out.println("Vendas: " + v.getVendas());
		}
	}
}