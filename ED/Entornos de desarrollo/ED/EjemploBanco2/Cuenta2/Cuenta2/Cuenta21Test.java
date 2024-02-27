package Cuenta2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class Cuenta21Test {
   @Cuenta2
    public void nuevacuenta2(){
       Cuenta2 cta = new Cuenta2("ES21099865462528660871295", 100);
    }

    @Test
    void testGetSaldo(){
        Cuenta2 cuenta1= new Cuenta2("ES21099865462528660871295", 100);
        float saldo= cuenta1.getSaldo();
        assertEquals(100,saldo,"ojo no va");
    }
    @Test
    void testSetSaldo(){
        Cuenta2 cuenta1 = new Cuenta2("ES21093948294287428749345353", 0);
        cuenta1.setSaldo(100);
        assertEquals(100, cuenta1.getSaldo());
    }
    //FALLA este test:
    @Test
    void testIngresarDinero(){
        Cuenta2 cuenta1 = new Cuenta2("ES390289342794782937849284", 100);
        cuenta1.ingresarDinero(400);
        assertEquals(500, cuenta1.getSaldo());
    }
}