import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleTest {

    Controle controle;
    EmBreve emBreve;

    @BeforeEach
    void setUp() {
        controle = new Controle();
        emBreve = new EmBreve ("O Senhor dos Anéis: A Sociedade do Anel");
    }

    @Test
    void deveAbrirEmBreve() {
        Strategy abrirEmBreve = new AbrirEmBreve(emBreve);
        controle.executarStrategy(abrirEmBreve);
        assertEquals("Em Breve disponível.", emBreve.getSituacao());
    }

    @Test
    void deveFecharEmBreve() {
        Strategy fechamentoSemestre = new FecharEmBreve(emBreve);
        controle.executarStrategy(fechamentoSemestre);
        assertEquals("Em Breve indisponível.", emBreve.getSituacao());
    }

    @Test
    void deveCancelarAberturaEmBreve() {
        Strategy aberturaEmBreve = new AbrirEmBreve(emBreve);
        controle.executarStrategy(aberturaEmBreve);
        controle.cancelarUltimoStrategy();
        assertEquals("Em Breve indisponível.", emBreve.getSituacao());
    }
}