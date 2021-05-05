package ar.edu.unlam.pb2.tp02;

public class CuentaSueldo extends Cuenta{

	public CuentaSueldo(Double saldo) {
		super(saldo);
	}

	@Override
	public void extraer(Double extraccion) {
		if(extraccion <= getSaldo()) {
			this.saldo = getSaldo() - extraccion;
		}
	}


	
}
