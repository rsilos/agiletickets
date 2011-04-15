package br.com.caelum.agiletickets;

import java.util.List;

public class NE {
	Enviador enviador;

	public NE(Enviador e) {
		this.enviador = e;
	}

	public void notifica(List<Espectador> asList) {

		for (Espectador espectador : asList) {

			enviador.envia(espectador);

		}

	}
}
