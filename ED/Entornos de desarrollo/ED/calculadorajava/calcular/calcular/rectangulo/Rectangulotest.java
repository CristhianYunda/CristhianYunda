package calcular.rectangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Rectangulotest {
    @Test
    public void TestCalcularAreaRectangulo(){
        Rectangulo rec = new Rectangulo(20,30);
        double resultado = rec.CalcularAreaRectangulo();
        assertEquals(599, resultado);
    }

}
