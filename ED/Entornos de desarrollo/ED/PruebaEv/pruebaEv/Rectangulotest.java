package pruebaEv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class Rectangulotest {
    @Test
    public void TestRectangulo(){
        Rectangulo rec = new Rectangulo(20,30);
        double resultado = rec.CalcularAreaRectangulo();
        assertEquals(600, resultado);
    }
    @Test
    void getBase(){
        Rectangulo rec = new Rectangulo(20,10);
        assertEquals(20, rec.getBase());
    }
    @Test
    void getAltura(){
        Rectangulo rec = new Rectangulo(20,10);
        assertEquals(10, rec.getAltura());
    }
    @Test
    void setBase(){
        Rectangulo rec = new Rectangulo(20,10);
        rec.setBase(20);
        assertEquals(20, rec.getBase());
    }
    @Test
    void setAltura(){
        Rectangulo rec = new Rectangulo(20, 10);
        rec.setAltura(10);
        assertEquals(10, rec.getAltura());
    }
}
