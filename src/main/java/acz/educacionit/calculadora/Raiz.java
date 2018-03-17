
package acz.educacionit.calculadora;

public class Raiz extends Operacion{
    @Override
    public Double calcular() {
        return Math.pow(getOperandoA(), 1/getOperandoB());
    }
}
