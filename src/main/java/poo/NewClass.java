/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.util.Scanner;
/**
 *
 * @author EducaciónIT
 */

public class NewClass {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        while (true) {
            System.out.print("Ingrese operacion:");
            String input = scanner.nextLine();

            switch (input) {
                case "h":
                    printAyuda();
                    break;
                case "e":
                    System.out.println("Chau!");
                    return;
                case "+":
                    int[] operandos = obtenerOperandos();
                    System.out.println("Resultado: " + (operandos[0] + operandos[1]));
                    break;
                case "-":
                    operandos = obtenerOperandos();
                    System.out.println("Resultado: " + (operandos[0] - operandos[1]));
                    break;
                case "/":
                    operandos = obtenerOperandos();
                    System.out.println("Resultado: " + (operandos[0] / operandos[1]));
                    break;                
                case "*":
                    operandos = obtenerOperandos();
                    System.out.println("Resultado: " + (operandos[0] * operandos[1]));
                    break;
                default:
                    printAyuda();
            }

        }

    }

    private static int[] obtenerOperandos() {
        System.out.print("A:");
        int a = scanner.nextInt();
        System.out.print("B:");
        int b = scanner.nextInt();
      
        return new int[] {a,b};
    }
    
    private static void printAyuda() {
        System.out.println("Ingrese las siguientes operaciones: + - / *");
        System.out.println("e: salir");
        System.out.println("h: ayuda");
    }

 } 
        
        
        
        
        
    
       
