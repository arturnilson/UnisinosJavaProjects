package LabII.Laboratorio6_Eleicoes.tests.estruturas;

/*
 *   Artur Nilson
 */

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import LabII.Laboratorio6_Eleicoes.estruturas.Candidato;

public class CandidatoTest {
    private Candidato candidato;

    @Before
    public void inicializa() {
        candidato = new Candidato("TesteNome", "TestePartido", 50, 120);
    }

    @Test
    public void testaInformacoesCandidato() {
        assertEquals("TesteNome", candidato.getNome());
        assertEquals("TestePartido", candidato.getPartido());
        assertEquals(50, candidato.getIdade());
        assertEquals(120, candidato.getVotos());
    }
}
