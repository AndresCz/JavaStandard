
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
    
    protected static Operacion obtenerOperacion(String tipoOperacion){
    Operacion operacion = null;

    switch (tipoOperacion) {
                case "+":
                    operacion = new Suma();
                    break;
                case "-":
                    operacion = new Resta();
                    break;
                case "/":
                    operacion = new Division();
                    break;                
                case "*":
                    operacion = new Multiplicacion();
                    break;
                case "p":
                    operacion = new Potencia();
                    break;
                case "r":
                    operacion = new Raiz();
                    break;
            }
            return operacion;

 }

}
//Una clase con un metodo abstracto tiene que ser definida como abstracta
//Una clase abstracta no se puede instanciar
