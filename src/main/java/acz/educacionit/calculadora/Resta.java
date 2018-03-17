
package acz.educacionit.calculadora;

public class Resta extends Operacion{
    @Override
    public Double calcular() {
        return getOperandoA()-getOperandoB();
    }
}
