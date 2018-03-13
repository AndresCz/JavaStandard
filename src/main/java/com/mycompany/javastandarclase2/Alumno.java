/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javastandarclase2;

// Herencia ===================================================================
/*
Una sub clase como primer sentencia tiene que llamar al menos un
constructor de la super clase

La super clase primaria de JAVA es la Clase Object se hereda

*/

public class Alumno extends Persona {
    
    private String legajo;
    
    public Alumno(String nombre, int edad, String legajo) {
        super(nombre, edad);//super invoca al contructor de la clase padre
        this.legajo = legajo;
    }
//Polimorfismo con sobre escritura ============================================
    @Override
    public void hablar() {
        super.hablar("Hola soy un alumno"); //To change body of generated methods, choose Tools | Templates.
    }



   
}

