
package acz.educacionit.calculadora;
import java.util.Scanner;
import acz.educacionit.calculadora.Memoria;

public class Calculadora {

    private Scanner scanner;
    private double buffer;

public static void main (String[] arg) throws TipoOperacionIncorrecta{
    Scanner scanner = new Scanner(System.in);
    String input;
    boolean calculoExtendido=false;//Flag
    Double calculoIntermedio;
    
    while (true) {
        try{
        System.out.println("Ingrese tipo de operacion: (a-ayuda)");
        String tipoOperacion = scanner.nextLine();
        if (tipoOperacion.equals("a")){
            mostrarAyuda();
            continue;
        }
        calculoIntermedio=0.0;
        do{
               
                if (!calculoExtendido){
                    System.out.println("Ingrese Operando A:");
                    String operandoA = scanner.nextLine();
                    System.out.println("Ingrese Operando B:");
                    String operandoB = scanner.nextLine();

                    Operacion op1 = obtenerOperacion(tipoOperacion);

                    op1.setOperandoA(Double.valueOf(operandoA));
                    op1.setOperandoB(Double.valueOf(operandoB));

                    calculoIntermedio = op1.calcular();
                    System.out.println("Resultado:");
                    System.out.println(calculoIntermedio);
                    calculoExtendido=true;

                }else{

                    System.out.println("Ingrese tipo de operacion: (a-ayuda)(=-finalizar operacion)");
                    tipoOperacion = scanner.nextLine();
                    if (tipoOperacion.equals("a")){
                        mostrarAyuda();
                        System.out.println("Ingrese tipo de operacion: (a-ayuda)(=-finalizar operacion)");
                        tipoOperacion = scanner.nextLine();
                    }
                    if(tipoOperacion.equals("=")){

                        System.out.println(calculoIntermedio);
                        calculoExtendido=false;
                        break;
                    }else{

                        Operacion op2= obtenerOperacion(tipoOperacion);

                        System.out.println("Ingrese operando B:");
                        String operandoB = scanner.nextLine();

                        op2.setOperandoA(calculoIntermedio);
                        op2.setOperandoB(Double.valueOf(operandoB));

                        calculoIntermedio = op2.calcular();
                        System.out.println("Resultado:");
                        System.out.println(calculoIntermedio);

                        }
                    }
            
        } while(!("=".equals(tipoOperacion)));
     } catch(TipoOperacionIncorrecta exception){
                System.out.println("Operacion incorrecta " + exception.getTipoOperacion());
                mostrarAyuda();
                throw new ErrorDeSistemaException(exception);
            }    
    }
    
}
private static Operacion obtenerOperacion(String tipoOperacion) throws TipoOperacionIncorrecta{
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
                case "a":
                    break;
                default:
                    throw new TipoOperacionIncorrecta(tipoOperacion);
            }
            return operacion;

 }

public static void mostrarAyuda(){
        System.out.println("Opciones:");
        System.out.println("+");
        System.out.println("-");
        System.out.println("/");
        System.out.println("*");
        System.out.println("p - potencia");
        System.out.println("r - raiz");
}

}
        
        
        







    
