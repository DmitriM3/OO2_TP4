package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import modelo.Spike;
import modelo.Tarea;
import modelo.UserStory;

class ScrumItemsTest {

	@Test
	void calcularTiempoEstimadoDeProyecto20Puntos() {
		// SETUP
		Spike spike1 = new Spike(2);
		Spike spike2 = new Spike(3);
		Spike spike3 = new Spike(3);
		Tarea tarea1 = new Tarea(2);
		Tarea tarea2 = new Tarea(5);
		UserStory us1 = new UserStory(5);
		us1.agregarItem(spike1);
		us1.agregarItem(spike2);
		us1.agregarItem(spike3);
		us1.agregarItem(tarea1);
		us1.agregarItem(tarea2);
		// EJERCITACION
		int tiempoEstimado = us1.calcularTiempo();
		// VERIFICACION
		Assert.assertEquals(20, tiempoEstimado);
	}

}
