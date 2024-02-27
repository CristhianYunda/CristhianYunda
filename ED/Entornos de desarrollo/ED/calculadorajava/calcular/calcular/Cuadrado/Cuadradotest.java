package calcular.Cuadrado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Cuadradotest {
    @Test
    public void TestCalcularAreaCuadrado(){
        Cuadrado cua = new Cuadrado(5);
        double resultado = cua.CalcularAreaCuadrado();
        assertEquals(25.0, resultado);

    }
    
}
