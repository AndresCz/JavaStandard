
package acz.educacionit.calculadora;

public class Multiplicacion extends Operacion{
    @Override
    public Double calcular() {
        return getOperandoA()*getOperandoB();
    }
}
