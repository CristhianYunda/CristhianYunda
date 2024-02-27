package calcular.Triangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Triangulotest {
    @Test
    public void TestTriangulo(){
        Triangulo tri = new Triangulo(20,10);
        double resultado = tri.CalcularAreaTriangulo();
        assertEquals(99, resultado);
    }
}
