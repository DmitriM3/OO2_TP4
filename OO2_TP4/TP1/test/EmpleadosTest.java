package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import modelo.Director;
import modelo.Gerente;
import modelo.LiderDeProyecto;
import modelo.MandoMedio;
import modelo.Regular;

class EmpleadosTest {

	@Test
	void calcularMontoTotalSalarial() {
		// SETUP
		Regular regular1 = new Regular(500);
		Regular regular2 = new Regular(500);
		LiderDeProyecto liderProyecto = new LiderDeProyecto(1000);
		liderProyecto.add(regular1);
		liderProyecto.add(regular2);
		MandoMedio mandoMedio = new MandoMedio(1500);
		mandoMedio.add(liderProyecto);
		Gerente gerente = new Gerente(2000);
		gerente.add(mandoMedio);
		Director director = new Director(2500);
		director.add(gerente);
		// EJERCITACION
		double total = director.cacularMontoTotaldeSueldos();
		// VERIFICACION
		Assert.assertEquals(8000.0, total, 0.001);
	}

}
