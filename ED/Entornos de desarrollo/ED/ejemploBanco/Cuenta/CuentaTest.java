package Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CuentaTest {

    @Test
    void testGetSaldo(){
        Cuenta cuenta1= new Cuenta("ES21099865462528660871295", 100);
        float saldo= cuenta1.getSaldo();
        assertEquals(100,saldo,"ojo no va");
    }
    @Test
    void testSetSaldo(){
        Cuenta cuenta1 = new Cuenta("ES21093948294287428749345353", 0);
        cuenta1.setSaldo(100);
        assertEquals(100, cuenta1.getSaldo());
    }
    @Test
    void testIngresarDinero(){
        Cuenta cuenta1 = new Cuenta("ES390289342794782937849284", 100);
        cuenta1.ingresarDinero(400);
        assertEquals(500, cuenta1.getSaldo());
    }
}
