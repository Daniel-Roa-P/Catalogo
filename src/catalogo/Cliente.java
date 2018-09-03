/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;


public class Cliente {
    
    private final ArmaAbstracta arma;
    private EscudoAbstracto escudo;
    private MonturaAbstracta montura;
    private final AparienciaAbstracta aspecto;

    Cliente(FabricaPersonajes factory) {
        
        arma=factory.crearArma();
        aspecto=factory.crearApariencia();
        
    }

    public String recibirArma() {
        
        return arma.mostrar();

    }
    public String recibirAspecto() {
        
        return aspecto.mostrarApariencia();

    }
//    public String recibirMontura() {
//        
//        return arma.mostrar();
//
//    }
//    public String recibirArmadura() {
//        
//        return arma.mostrar();
//
//    }
    
}
