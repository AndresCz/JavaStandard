package interfaces;

public class CodigoJava extends Codigo {

    public CodigoJava(String codigoFuente) {
        super(codigoFuente);
    }

    @Override
    public Binario compilar() {
        System.out.println("Compilando a ByteCode");
        return new ByteCode();
    }    
    
}
