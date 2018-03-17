
package acz.educacionit.calculadora;

public class Suma extends Operacion{
    @Override
    public Double calcular() {
        return getOperandoA()+getOperandoB();
    }
}
