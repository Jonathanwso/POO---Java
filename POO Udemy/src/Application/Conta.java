package Application;

public class Conta {
	String titular;
	int agencia;
	int numero;
	double saldo;

	// Construct
	public void Inicializa(Conta pconta, String ti, int ag, int nu, double sa) {
		this.titular = ti;
		this.agencia = ag;
		this.numero = nu;
		this.saldo = sa;
	}

	public boolean deposito(Conta pconta, double valor) {
		if (valor>0) {
			pconta.saldo += valor;
			// this.saldo = this.saldo + valor;
		}
		
		return true;
	}

	public boolean saque(Conta pconta, double valor) {
		if (this.saldo >= valor) {
			pconta.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public void imprime(Conta pconta) {
		System.out.println("Saldo: " + pconta.saldo);
	}

	public boolean transfere(double valor, Conta pcontaDestino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			pcontaDestino.deposito(pcontaDestino, valor);
			return true;
		} else {
			return false;
		}
	}

}


