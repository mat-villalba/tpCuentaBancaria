package ar.edu.unlam.pb2.tp02;

public class CuentaCorriente extends Cuenta{

	private Double descubierto = 500.00;
	private Double indiceDeComision = 0.05; 
	private Double deudaConElBanco = 0.00;
	private Double montoEnDescubiertoUsado = 0.00;
	
	public Double getDeudaConElBanco() {
		return deudaConElBanco;
	}

	public CuentaCorriente(Double saldo) {
		super(saldo);
	}

	@Override
	public void extraer(Double extraccion) {
		if(extraccion <= getSaldo()) {
			this.saldo = saldo - extraccion;
		} if(extraccion > getSaldo() && extraccion <= (getSaldo() + descubierto)) {
			// 200     >   100
			montoEnDescubiertoUsado = extraccion - getSaldo();
			deudaConElBanco = (montoEnDescubiertoUsado * indiceDeComision) + montoEnDescubiertoUsado;
			if(descubierto <= deudaConElBanco) {
				this.saldo = 0.00;
			}
		}
	}
	
	@Override
	public void depositar(Double deposito) {
		if(deudaConElBanco > (Double)0.00) {
			this.saldo = deposito - deudaConElBanco;
		} else {
			this.saldo = saldo + deposito;
		}
	}
	
	
}
