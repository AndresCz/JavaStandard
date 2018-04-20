package interfaces;

public class CodigoCSharp extends Codigo {

    public CodigoCSharp(String codigoFuente) {
        super(codigoFuente);
    }

    @Override
    public Binario compilar() {
        System.out.println("Compilando a Cil");
        return new Cil();
    }
    
}
