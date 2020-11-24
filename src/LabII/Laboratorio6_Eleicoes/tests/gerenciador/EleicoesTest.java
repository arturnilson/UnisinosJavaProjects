package LabII.Laboratorio6_Eleicoes.tests.gerenciador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import LabII.Laboratorio6_Eleicoes.estruturas.Candidato;
import LabII.Laboratorio6_Eleicoes.gerenciador.Eleicoes;

public class EleicoesTest {
    @Test
    public void testaMediaVotos() {
        Eleicoes el = new Eleicoes();
        Candidato c1 = new Candidato("Maria", "PPP", 36, 200);
        Candidato c2 = new Candidato("João", "PPP", 57, 300);

        el.registraCandidato(c1, c2);

        assertEquals(40.0, el.mediaVotosPorCandidato(c1), 0);
        assertEquals(60.0, el.mediaVotosPorCandidato(c2), 0);
    }

    @Test
    public void testaTotalVotos() {
        Eleicoes el = new Eleicoes();
        Candidato c1 = new Candidato("Maria", "PPP", 36, 200);
        Candidato c2 = new Candidato("João", "PPP", 57, 300);

        el.registraCandidato(c1, c2);

        assertEquals(500, el.totalVotosRecebidos());
    }
}
