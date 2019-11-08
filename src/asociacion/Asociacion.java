/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacion;

/**
 *
 * @author AULAFISI
 */
public class Asociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Direccion d1=new Direccion("Test");
        Cliente c1=new Cliente("Test","Eduardo");
        c1.agregarCuenta("cuenta1");
        c1.agregarCuenta("cuenta2");
        c1.mostrarDireccion();
        c1.cuentas[0].ingresar(450);
        c1.cuentas[1].ingresar(650);
        c1.cuentas[0].mostrarDinero();
        c1.cuentas[1].mostrarDinero();
        c1.cuentas[0].transfiereA(c1.cuentas[1], 150);
        c1.cuentas[0].mostrarDinero();
        c1.cuentas[1].mostrarDinero();
        
    }
    
}
