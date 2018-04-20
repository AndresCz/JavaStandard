package interfaces;

public class ProgramadorCSharp extends ProgramadorNovato /*implements Programador*/ {

    public ProgramadorCSharp(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public Codigo programar() {
        System.out.println(getNombre()+ " - Programando en C#");
        return new CodigoCSharp("codigo C#");
    }
    
    
    
   
}
