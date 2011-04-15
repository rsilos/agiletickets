package br.com.caelum.agiletickets.models;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.junit.Test;

public class EspetaculoTeste {

	@Test
	public void deveCriarUmaSessaoDiaria() {
		Espetaculo espetaculo = new Espetaculo();
		LocalDate inicio = new LocalDate(2010, 01, 01);
		LocalTime horario = new LocalTime(12,00,00);
		List<Sessao> sessoes = espetaculo.criaSessoes(inicio,inicio,horario, Periodicidade.DIARIA);
		Sessao sessao = sessoes.get(0);
		assertEquals(inicio.toDateTime(horario) , sessao.getInicio());
	}
	
	@Test
	public void deveCriarSessoesDiariasParaUmPeriodoGrande() {
		Espetaculo espetaculo = new Espetaculo();
		LocalDate inicio = new LocalDate(2010, 01, 01);
		LocalDate fim = new LocalDate(2010, 01, 03);
		LocalTime horario = new LocalTime(12,00,00);
		
		List<Sessao> sessoes = espetaculo.criaSessoes(inicio, fim, horario, Periodicidade.DIARIA);
		
		assertEquals(3, sessoes.size());
		assertEquals(inicio.toDateTime(horario), sessoes.get(0).getInicio());
		assertEquals(inicio.plusDays(1).toDateTime(horario), sessoes.get(1).getInicio());
		assertEquals(inicio.plusDays(2).toDateTime(horario), sessoes.get(2).getInicio());
	}
	
}
