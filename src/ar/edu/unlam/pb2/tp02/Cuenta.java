package ar.edu.unlam.pb2.tp02;

public class Cuenta {

	protected Double saldo;
	private Double extraccion;
	private Double deposito;
	
	
	public Cuenta(Double saldo) {
		this.saldo=saldo;
	}
	
	public void depositar(Double deposito) {
		this.saldo = saldo + deposito;
	}
	
	public void extraer(Double extraccion) {
		this.saldo = saldo - extraccion;
	}

	public Double getSaldo() {
		return saldo;
	}

}
