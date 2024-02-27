package calcular;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calcularTest {
    
    @Test
    public void Testsuma(){
        calcular calcu = new calcular(20, 10);
        int resultado = calcu.suma();
        assertEquals (30, resultado);

    }
    @Test
    public void Testresta(){
        calcular calcu = new calcular(20, 10);
        int resultado = calcu.resta();
        assertEquals (10, resultado);

    }
    @Test
    public void Testmultiplicacion(){
        calcular calcu = new calcular(20, 10);
        int resultado = calcu.multiplicar();
        assertEquals (200, resultado);

    }
    @Test
    public void Testdivide2(){
        calcular calcu = new calcular(20, 10);
        int resultado = calcu.divide2();
        assertEquals (2, resultado);

    }
    
}
