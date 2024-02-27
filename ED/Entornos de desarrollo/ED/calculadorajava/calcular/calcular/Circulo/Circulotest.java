package calcular.Circulo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Circulotest {
    @Test
    public void TestCalcularAreaCirculo(){
        Circulo cir = new Circulo(10);
		double resultado = cir.CalcularAreaCirculo();
        assertEquals(50.546456, resultado);
    }
}
