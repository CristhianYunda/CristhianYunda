package pruebaEv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class Cuadradotest {
    @Test
    public void TestCalcularAreaCuadrado(){
        Cuadrado cua = new Cuadrado(5);
        double resultado = cua.CalcularAreaCuadrado();
        assertEquals(25.0, resultado);

    }
    @Test
    void getBase(){
        Cuadrado cua = new Cuadrado(5);
        assertEquals(5, cua.getBase());
    }
    @Test
    void setBase(){
        Cuadrado cua = new Cuadrado(5);
        cua.setBase(5);
        assertEquals(5, cua.getBase());
    }
    
}
