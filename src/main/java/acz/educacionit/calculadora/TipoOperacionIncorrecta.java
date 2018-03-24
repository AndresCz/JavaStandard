/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acz.educacionit.calculadora;

/**
 *
 * @author EducaciónIT
 */
public class TipoOperacionIncorrecta extends Exception {
    
    private String tipoOperacion;
    
    public TipoOperacionIncorrecta(String tipoOperacion) {
        super("Tipo de operacion incorrecta "+tipoOperacion);
        this.tipoOperacion=tipoOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }
    
}
