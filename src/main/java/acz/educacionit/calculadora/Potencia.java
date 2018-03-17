
package acz.educacionit.calculadora;

public class Potencia extends Operacion{
    @Override
    public Double calcular() {
        return Math.pow(getOperandoA(), getOperandoB());
    }
}
