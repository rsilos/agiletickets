package br.com.caelum.agiletickets;

import static org.mockito.Mockito.mock;

import java.util.Arrays;

import org.junit.Test;
import org.mockito.Mockito;

public class NotificaEspectadorTeste {

	@Test
	public void deveNotificarQuemTemIngressoMais2dias() {

		Espectador e = new Espectador();

		Enviador enviador = mock(Enviador.class);

		NE notificador = new NE(enviador);

		notificador.notifica(Arrays.asList(e));

		Mockito.verify(enviador).envia(e);

	}

}
