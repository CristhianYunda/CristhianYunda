package calcular.Triangulo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Triangulotest {
    @Test
    public void testCalcularAreaTriangulo() {
        Triangulo tri = new Triangulo(20,10);
        double resultado = tri.CalcularAreaTriangulo();
        assertEquals(100, tri.CalcularAreaTriangulo());
     }

     @Test
     void testGetAltura() {
        Triangulo tri = new Triangulo(20,10);
        assertEquals(10, tri.getAltura());
     }
 
     @Test
     void testGetBase() {
         Triangulo tri = new Triangulo(20,10);
         assertEquals(20,tri.getBase());
         
     }
 
     @Test
     void testSetAltura() {
        Triangulo tri = new Triangulo(2,3);
        tri.setAltura(5);
        assertEquals(5, tri.getAltura());
     }
 
     @Test
     void testSetBase() {
 
     }
 }
    