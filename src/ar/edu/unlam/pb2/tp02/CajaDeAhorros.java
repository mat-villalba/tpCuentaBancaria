package ar.edu.unlam.pb2.tp02;

public class CajaDeAhorros extends Cuenta{

	private Double costoAdicional = 6.0;
	private Integer contador = 0;
	
	public CajaDeAhorros(Double saldo) {
		super(saldo);
	}
	
	@Override
	public void extraer(Double extraccion) {
		if(extraccion <= getSaldo() && getSaldo() > costoAdicional) {
			if(contador < (Integer)5) {
				this.saldo = getSaldo() - extraccion;
				contador++;
			} else {
				this.saldo = getSaldo() - extraccion - costoAdicional;
			}
		}
	}

}
