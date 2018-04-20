package interfaces;

public abstract class Codigo {

    private final String codigoFuente;

    public Codigo(String codigoFuente) {
        this.codigoFuente = codigoFuente;
    }

    public String getCodigoFuente() {
        return codigoFuente;
    }
    
    public abstract Binario compilar();
        
}
