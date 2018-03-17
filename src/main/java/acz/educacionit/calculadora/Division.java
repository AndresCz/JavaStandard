
package acz.educacionit.calculadora;

public class Division extends Operacion{
    @Override
    public Double calcular() {
        return getOperandoA()/getOperandoB();
    }
}
