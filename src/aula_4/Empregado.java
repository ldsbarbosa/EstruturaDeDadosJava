package aula_4;

public class Empregado {
	private int matricula;
	private String nome;
	private double salarioBruto, inss, impostoDeRenda, salarioLiquido;
	
	public Empregado(int matricula, String nome, double salarioBruto, double inss, double impostoDeRenda,
			double salarioLiquido) {
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.inss = inss;
		this.impostoDeRenda = impostoDeRenda;
		this.salarioLiquido = salarioLiquido;
	}
	
	public Empregado(int matricula, String nome, double salarioBruto) {
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
	}
	
	public Empregado() {
		this.matricula = (int) (Math.random()*100000);
		this.nome = "Nome de Teste";
		this.salarioBruto = 5000;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getInss() {
		return inss;
	}

	public void setInss(double inss) {
		this.inss = inss;
	}

	public double getImpostoDeRenda() {
		return impostoDeRenda;
	}

	public void setImpostoDeRenda(double impostoDeRenda) {
		this.impostoDeRenda = impostoDeRenda;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public void calcularINSS(){ // Segundo tabela INSS de 2023
		// Fonte: https://www.contabilizei.com.br/contabilidade-online/desconto-inss/#quais-sao-as-novas-faixas-de-contribuicao-do-inss
		if(this.salarioBruto == 0) {
			System.out.println("Insira o salário bruto.");
			return;
		}
		
		if(this.salarioBruto <= 1302) { // Primeira faixa
			this.inss = this.salarioBruto * 0.075;
		}else if(this.salarioBruto <= 2571.29 || this.salarioBruto > 1302){  // Segunda faixa
			this.inss = 1302 * 0.075 +
						(this.salarioBruto - 1302) * 0.09;
		}else if(this.salarioBruto <= 3856.94 || this.salarioBruto > 2571.29){  // Terceira faixa
			this.inss = 1302 * 0.075 +
						(2571.29 - 1302) * 0.09 +
						(this.salarioBruto - 2571.29) * 0.012;
		}else if(this.salarioBruto <= 7507.49 || this.salarioBruto > 3856.94){  // Quarta faixa
			this.inss = 1302 * 0.075 +
						(2571.29 - 1302) * 0.09 +
						(3856.94 - 2571.29) * 0.012 +
						(this.salarioBruto - 3856.94) * 0.014;
		}else if(this.salarioBruto > 7507.49) {
			this.inss = 1302 * 0.075 +
						(2571.29 - 1302) * 0.09 +
						(3856.94 - 2571.29) * 0.012 +
						(7507.49 - 3856.94) * 0.014;
		}
	}
	public void calcularImposto(){
		/* 
		 * Esse calculo de imposto de renda leva em conta que o empregado não tem nenhum dependente,
		 * não paga pensão alimentícia e não tem outras deduções.
		 * É a tabela de 2023.
		 * */
		if(this.inss == 0 || this.salarioBruto == 0) {
			System.out.println("Insira o salário bruto e, após, calcule o INSS.");
			return;
		}
		
		if(this.salarioBruto <= 1903.98) { // Primeira faixa
			this.impostoDeRenda = 0;
		}else if(this.salarioBruto <= 2826.65 || this.salarioBruto > 1903.98){  // Segunda faixa
			this.impostoDeRenda = (this.salarioBruto - this.inss) * 0.075;
		}else if(this.salarioBruto <= 3751.05 || this.salarioBruto > 2826.65){  // Terceira faixa
			this.impostoDeRenda = (this.salarioBruto - this.inss) * 0.15;
		}else if(this.salarioBruto <= 4664.68 || this.salarioBruto > 3751.05){  // Quarta faixa
			this.impostoDeRenda = (this.salarioBruto - this.inss) * 0.225;
		}else if(this.salarioBruto > 4664.68) {
			this.impostoDeRenda = (this.salarioBruto - this.inss) * 0.275;
		}
	}
	public void calcularSalarioLiquido(){
		if(this.salarioBruto == 0 || this.inss == 0 || this.impostoDeRenda == 0) {
			System.out.println("Insira o salário bruto e, após, calcule o INSS. Após isso, calcule o IR.");
			return;
		}
		this.salarioLiquido = this.salarioBruto - (this.inss + this.impostoDeRenda);		
	}
	
	public void imprimirDados(){
		System.out.println(
				"Nome do empregado:			"+nome+"\n"+
				"Número de matrícula:		"+matricula+"\n"+
				"#-----------------#\n"+
				"Salário Bruto:				$"+salarioBruto+"\n"+
				"Salário Líquido:			$"+salarioLiquido+"\n"+
				"Imposto de Renda:			$"+impostoDeRenda+"\n"+
				"INSS:						$"+inss+"\n"+
				"###############\n###############");
	}
}
