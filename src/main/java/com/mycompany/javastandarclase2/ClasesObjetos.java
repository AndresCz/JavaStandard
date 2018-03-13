/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javastandarclase2;

/**
 *
 * @author EducaciónIT
 */
public class ClasesObjetos {
    /*
        Para que una clase sea public tiene que tener el mismo nombre 
        del archivo.java para que compile
    
    */

// MAIN =======================================================================    
    public static void main(String[] args) {
        
        /*
        Persona p = new Persona();
        
        p.nombre = "Juan";
        p.edad = 30;
        
        //Deja de compilar porque deja de existir el contructor por default de java
        
        // Persona() <---- Java crea un contructor default
        */
        
        Persona p = new Persona("Juan",30);
        
        
        p.hablar();
        p.dormir();
        
        
        //Persona p1 = p; //Creamos una variable p1 que apunta al objeto p
        
        //p1.nombre = "Jorge";
        
        //System.out.println(p.nombre);
        //System.out.println(p1.nombre);
    
        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
        
        Persona p2 = new Persona("Jorge");
        p2.saludo();
        p2.hablar("Hola como te va");
        p2.hablar();
    }
    
}
// Clase ======================================================================
class Persona{
    
    // Atributos ==============================================================
    private String nombre;
    private int edad;
    
    /*
        public - se puede acceder desde todo el programa
        private - solo se pueden acceder desde la clase solamente
        package default
    */

    //Constructor de objetos - propiedades ====================================
    Persona(String nombre, int edad ){
        /*
        this.nombre = nombre; //this desambigua el "nombre" de las propiedades
                              //del constructor al "nombre" de los atributos
        this.edad = edad;
        */
        //Con Setter & Getter
        setNombre(nombre);
        setEdad(edad);
    }
    
    //Sobrecargar constructor =================================================
    public Persona (String nombre){
        this(nombre,0);
    }
    
    // Metodos Getter & Setter cuando los atributos se definen "private" =======
    
    public final void setNombre(String nombre){
        this.nombre = nombre;
        }
    
            
    public final void setEdad(int edad){
        if (edad < 0)
            throw new RuntimeException("Edad negativa");
        this.edad = edad;
    }        
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }    
    
    //  Metodos ===============================================================
    
    void hablar(){
        this.hablar("Hola soy una persona");
    }
    // Sobrecargar metodo hablar ==============================================
    public void hablar(String msg){
        System.out.println(msg);
    }
    
    void dormir(){
        System.out.println("Durmiendo");
    }
    
    public void saludo(){
        System.out.println("Hola! Soy "+this.nombre);
    }
}


