import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(4, calculadora.somar(2, 2));
        assertEquals(-1, calculadora.somar(-3, 2));
        assertEquals(0, calculadora.somar(0, 0));
    }

    @Test
    public void testSubtrair() {
        Calculadora calculadora = new Calculadora();
        assertEquals(3, calculadora.subtrair(5, 2));
        assertEquals(-3, calculadora.subtrair(2, 5));
        assertEquals(0, calculadora.subtrair(0, 0));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-6, calculadora.multiplicar(-2, 3));
        assertEquals(0, calculadora.multiplicar(0, 5));
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(-2, calculadora.dividir(6, -3));
        assertEquals(0, calculadora.dividir(0, 5));
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(5, 0);
        });
    }
}