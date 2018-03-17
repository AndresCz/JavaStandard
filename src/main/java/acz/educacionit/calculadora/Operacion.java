
package acz.educacionit.calculadora;

public abstract class  Operacion {
    private Double operandoA;
    private Double operandoB;
    
    public abstract Double calcular();

    public Double getOperandoA() {
        return operandoA;
    }

    public Double getOperandoB() {
        return operandoB;
    }

    public void setOperandoA(Double operandoA) {
        this.operandoA = operandoA;
    }

    public void setOperandoB(Double operandoB) {
        this.operandoB = operandoB;
    }
    
    

}
//Una clase con un metodo abstracto tiene que ser definida como abstracta
//Una clase abstracta no se puede instanciar
