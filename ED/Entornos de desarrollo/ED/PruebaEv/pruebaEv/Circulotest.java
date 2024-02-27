package pruebaEv;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class Circulotest {
    @Test
    public void TestCalcularAreaCirculo(){
        Circulo cir = new Circulo(10);
		double resultado = cir.CalcularAreaCirculo();
        assertEquals(314.1592653589793, resultado);
    }
    @Test
    public void getRadio(){
        Circulo cir = new Circulo(10);
        assertEquals(10, cir.getRadio());
    }
    @Test
    public void setRadio(){
        Circulo cir = new Circulo(10);
        cir.setRadio(10);
        assertEquals(10, cir.getRadio());
    }
    
}
