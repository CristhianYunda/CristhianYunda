package calcular;

public class calcular {

    private int num1;
    private int num2;

    public calcular(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int suma() {
        int resul = num1 + num2;
        return resul;
    }

    public int multiplicar() {
        int resul = num1 * num2;
        return resul;
    }

    public int resta() {
        int resul;
        if (resta21())
            resul = num1 - num2;
        else
            resul = num2 - num1;
        return resul;
    }

    /**
     * @return
     */

    public boolean resta21() {
        if (num1 >= num2)
            return true;
        else
            return false;
    }

    public Integer divide2() {
        if (num2 == 0)
            return null;

        int resul = num1 / num2;
        return resul;
    }
}