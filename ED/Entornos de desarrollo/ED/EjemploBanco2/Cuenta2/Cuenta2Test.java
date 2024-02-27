package Cuenta2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class Cuenta2Test {

    @Test
    void testGetSaldo(){
        Cuenta2 cuenta1= new Cuenta2("ES21099865462528660871295", 100);
        float saldo= cuenta2.getSaldo();
        assertEquals(100,saldo,"ojo no va");
    }
    @Test
    void testSetSaldo(){
        Cuenta2 cuenta1 = new Cuenta2("ES21093948294287428749345353", 0);
        cuenta2.setSaldo(100);
        assertEquals(100, cuenta1.getSaldo());
    }
    @Test
    void testIngresarDinero(){
        Cuenta2 cuenta1 = new Cuenta2("ES390289342794782937849284", 100);
        cuenta1.ingresarDinero(400);
        assertEquals(500, cuenta1.getSaldo());
    }
}
