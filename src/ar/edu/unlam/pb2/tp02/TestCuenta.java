package ar.edu.unlam.pb2.tp02;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuenta {

	@Test
	public void queSePuedaCrearUnaCuenta() {
		Cuenta cuenta = new Cuenta(1500.00);
		assertNotNull(cuenta);
	 }

	@Test
	public void queSePuedaConsultarElSaldoDeUnaCuenta() {
		Cuenta cuenta = new Cuenta(1500.00);
		Double valorEsperado = 1500.00;
		Double valorObtenido = cuenta.getSaldo();
		assertEquals(valorEsperado, valorObtenido);
	 }
	@Test
	public void queSePuedaCrearUnaCuentaSueldo() {
		CuentaSueldo miCuentaSueldo = new CuentaSueldo(1200.00);
		assertNotNull(miCuentaSueldo);
	 }
	
	@Test
	public void queSePuedaCrearUnaCajaDeAhorro() {
		CajaDeAhorros miCajaDeAhorros = new CajaDeAhorros(3100.00);
		assertNotNull(miCajaDeAhorros);
	 }
	
	@Test
	public void queSePuedaCrearUnaCuentaCorriente() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente(2500.00);
		assertNotNull(miCuentaCorriente);
	 }
	
	@Test
	public void queSePuedaDepositarDineroEnUnaCuentaSueldo() {
		CuentaSueldo miCuentaSueldo = new CuentaSueldo(1200.00); 
		miCuentaSueldo.depositar(500.00);
		assertEquals((Double)1700.00, miCuentaSueldo.getSaldo());
	 }
	@Test
	public void queSePuedaExtraerDeUnaCuentaSueldoUnImporteMenorAlSaldo() {
		CuentaSueldo miCuentaSueldo = new CuentaSueldo(1200.00); 
		miCuentaSueldo.extraer(1000.00);
		assertEquals((Double)200.00, miCuentaSueldo.getSaldo());
	 }
	
	@Test
	public void queSePuedaExtraerDeUnaCuentaSueldoUnImporteIgualAlSaldo() {
		CuentaSueldo miCuentaSueldo = new CuentaSueldo(1200.00); 
		miCuentaSueldo.extraer(1200.00);
		assertEquals((Double)0.00, miCuentaSueldo.getSaldo());
	 }
	
	@Test
	public void queNoSePuedaExtraerDeUnaCuentaSueldoUnImporteMayorAlSaldo() {
		CuentaSueldo miCuentaSueldo = new CuentaSueldo(1200.00); 
		miCuentaSueldo.extraer(1500.00);
		assertEquals((Double)1200.00, miCuentaSueldo.getSaldo());
	 }
	
	@Test
	public void queNoSeCobreAdicionalLuegoDeLaQuintaExtraccionDeUnaCuentaSueldo() {
		CuentaSueldo miCuentaSueldo = new CuentaSueldo(1200.00); 
		miCuentaSueldo.extraer(100.00);
		miCuentaSueldo.extraer(100.00);
		miCuentaSueldo.extraer(100.00);
		miCuentaSueldo.extraer(100.00);
		miCuentaSueldo.extraer(100.00);
		miCuentaSueldo.extraer(100.00);
		assertEquals((Double)600.00, miCuentaSueldo.getSaldo());
	 }

	 @Test
	public void queSePuedaDepositarDineroEnUnaCuentaDeAhorro() {
		CajaDeAhorros miCajaDeAhorros = new CajaDeAhorros(3100.00);
		miCajaDeAhorros.depositar(400.00);
		assertEquals((Double)3500.00, miCajaDeAhorros.getSaldo());
	 }
	@Test
	public void queSePuedaExtraerDeUnaCuentaDeAhorroUnImporteMenorAlSaldo() {
		CajaDeAhorros miCajaDeAhorros = new CajaDeAhorros(3100.00);
		miCajaDeAhorros.extraer(3000.00);
		assertEquals((Double)100.00, miCajaDeAhorros.getSaldo());
	 }
	
	@Test
	public void queSePuedaExtraerDeUnaCuentaDeAhorroUnImporteIgualAlSaldo() {
		CajaDeAhorros miCajaDeAhorros = new CajaDeAhorros(3100.00);
		miCajaDeAhorros.extraer(3100.00);
		assertEquals((Double)0.00, miCajaDeAhorros.getSaldo());
	 }
	
	@Test
	public void queNoSePuedaExtraerDeUnaCuentaDeAhorroUnImporteMayorAlSaldo() {
		CajaDeAhorros miCajaDeAhorros = new CajaDeAhorros(3100.00);
		miCajaDeAhorros.extraer(5000.00);
		assertEquals((Double)3100.00, miCajaDeAhorros.getSaldo());
	 }
	
	@Test
	public void queSeCobreSeisPesosAdicionalesLuegoDeLaQuintaExtraccionDeUnaCuentaDeAhorro() {
		CajaDeAhorros miCajaDeAhorros = new CajaDeAhorros(3100.00);
		miCajaDeAhorros.extraer(100.00);
		miCajaDeAhorros.extraer(100.00);
		miCajaDeAhorros.extraer(100.00);
		miCajaDeAhorros.extraer(100.00);
		miCajaDeAhorros.extraer(100.00);
		miCajaDeAhorros.extraer(100.00);
		assertEquals((Double)2494.00, miCajaDeAhorros.getSaldo());
	 }
	
	@Test
	public void queNoSeCobreNingunAdicionalAntesDeLaQuintaExtraccionDeUnaCuentaDeAhorro() {
		CajaDeAhorros miCajaDeAhorros = new CajaDeAhorros(3100.00);
		miCajaDeAhorros.extraer(1000.00);
		miCajaDeAhorros.extraer(1000.00);
		miCajaDeAhorros.extraer(1000.00);
		assertEquals((Double)100.00, miCajaDeAhorros.getSaldo());
	 }
	
	@Test
	public void queNoSeCobreNingunAdicionalEnLaQuintaExtraccionDeUnaCuentaDeAhorro() {
		CajaDeAhorros miCajaDeAhorros = new CajaDeAhorros(3100.00);
		miCajaDeAhorros.extraer(200.00);
		miCajaDeAhorros.extraer(200.00);
		miCajaDeAhorros.extraer(200.00);
		miCajaDeAhorros.extraer(200.00);
		miCajaDeAhorros.extraer(200.00);
		assertEquals((Double)2100.00, miCajaDeAhorros.getSaldo());
	 }
	
	@Test
	public void queSePuedaDepositarDineroEnUnaCuentaCorriente() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente(2500.00);
		miCuentaCorriente.depositar(500.00);
		assertEquals((Double)3000.00, miCuentaCorriente.getSaldo());
	 }
	
	@Test
	public void queSePuedaExtraerDeUnaCuentaCorrienteUnImporteMenorAlSaldo() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente(2500.00);
		miCuentaCorriente.extraer(500.00);
		assertEquals((Double)2000.00, miCuentaCorriente.getSaldo());
	 }
	
	@Test
	public void queSePuedaExtraerDeUnaCuentaCorrienteoUnImporteIgualAlSaldo() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente(2500.00);
		miCuentaCorriente.extraer(2500.00);
		assertEquals((Double)0.00, miCuentaCorriente.getSaldo());
	 }
	
	@Test
	public void queSePuedaExtraerDeUnaCuentaCorrienteoUnImporteIgualAlSaldoMasElDescubierto() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente(1000.00);
		miCuentaCorriente.extraer(1500.00);
		assertEquals((Double)0.00, miCuentaCorriente.getSaldo());
		assertEquals((Double)525.00, miCuentaCorriente.getDeudaConElBanco());
	 }
	
	@Test
	public void queNoSePuedaExtraerDeUnaCuentaCorrienteUnImporteMayorAlSaldoMasElDescubierto() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente(1000.00);
		miCuentaCorriente.extraer(2000.00);
		assertEquals((Double)1000.00, miCuentaCorriente.getSaldo());
	 }
	
	@Test
	public void queSeCobreCincoPorcientoDeComisionAlDepositarDineroLuegoDeHaberRealizadoUnaExtraccionMayorAlSaldo() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente(100.00);
		miCuentaCorriente.extraer(200.00);
		assertEquals((Double)105.00, miCuentaCorriente.getDeudaConElBanco());
		miCuentaCorriente.depositar(200.00);
		assertEquals((Double)95.00, miCuentaCorriente.getSaldo());
	 }

}
