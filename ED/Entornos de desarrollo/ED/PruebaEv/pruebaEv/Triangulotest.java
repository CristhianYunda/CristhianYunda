package pruebaEv;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Triangulotest {
    @BeforeEach
    private void otroTriangulo(){
       Triangulo trian = new Triangulo(10, 30);
    }
    
    @Test
    public void TestCalcularAreaTriangulo(){
        Triangulo tri = new Triangulo(20,10);
        double resultado = tri.CalcularAreaTriangulo();
        assertEquals(100, resultado);
    }
    @Test
    void getBase(){
        Triangulo tri = new Triangulo(20,10);
        assertEquals(20, tri.getBase());
    }
    @Test
    void getAltura(){
        Triangulo tri = new Triangulo(20,10);
        assertEquals(10, tri.getAltura());
    }
    @Test
    void setBase(){
        Triangulo tri = new Triangulo(20,10);
        tri.setBase(20);
        assertEquals(20, tri.getBase());
    }
    @Test
    void setAltura(){
        Triangulo tri = new Triangulo(20, 10);
        tri.setAltura(10);
        assertEquals(10, tri.getAltura());
    }
}
