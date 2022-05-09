package entities;

public class Conta {

	private int conta;
	private String nome;
	private double saldo;
	private double deposito;
	private double saque;
	static int registros = 0;
	
	//Contrutores
//	public Conta() {
//		}
	public Conta(int conta, String nome) {
		Conta.registros++;
		this.conta = conta;
		this.nome = nome;
	}
	public Conta(int conta, String nome, double saldo, double deposito, double saque) {
		Conta.registros++;
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
		this.deposito = deposito;
		this.saque = saque;
	}
	//Metodos Get e Set
	
	public static int getRegistros() {
		return Conta.registros;
	}
	public int getConta() {
		return conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	public double getSaque() {
		return saque;
	}
	public void setSaque(double saque) {
		this.saque = saque;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//Metodos
	public double saldoConta() {
		return saldo + deposito;
	}
	public void saldoD(double valorD) {
		this.deposito += valorD;
	}
	public void depositoC(double deposito) {
		this.saldo += deposito;
	}
	public void saqueC(double saque) {
		this.saldo -= saque + 5.00;
	}
	
	public String toString() {
		return "Numero da conta: " + conta + " Nome: " + nome + " Saldo: " + String.format("%.2f", saldoConta());
	}
}
