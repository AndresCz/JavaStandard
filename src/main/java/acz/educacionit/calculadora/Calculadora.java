
package acz.educacionit.calculadora;
import static acz.educacionit.calculadora.Operacion.obtenerOperacion;
import java.util.Scanner;

public class Calculadora {

    private Scanner scanner;
    private Memoria memoria;
    private double buffer;

public static void main (String[] arg){
    Scanner scanner = new Scanner(System.in);
    String input;
    boolean calculoExtendido=false;//Flag
    Double calculoIntermedio;
    
    while (true) {
        String tipoOperacion = scanner.nextLine();
        calculoIntermedio=0.0;
        do{
            
        if (!calculoExtendido){
        
        String operandoA = scanner.nextLine();
        String operandoB = scanner.nextLine();
    
        Operacion operacion = Operacion.obtenerOperacion(tipoOperacion);
        
        operacion.setOperandoA(Double.valueOf(operandoA));
        operacion.setOperandoB(Double.valueOf(operandoB));
    
        calculoIntermedio = operacion.calcular();
        calculoExtendido=true;
        }else{
        tipoOperacion = scanner.nextLine();
        if(tipoOperacion == "="){
            System.out.println(calculoIntermedio);
        }else{
        String operandoB = scanner.nextLine();
        
        Operacion operacion= obtenerOperacion(tipoOperacion);
        operacion.setOperandoA(Double.valueOf(operandoB));
    
        calculoIntermedio = operacion.calcular();    
        }
        }
        } while(tipoOperacion != "=");
        
        
    }
    
}
}
        
        
        







    
