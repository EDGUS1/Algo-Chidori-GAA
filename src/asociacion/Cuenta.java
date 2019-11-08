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
public class Cuenta {
    public Dinero dinero;
    public String nombre;
    public Cliente cliente;
    public Cuenta(String nombre, Cliente cliente){
        this.cliente=cliente;
        this.nombre=nombre;
        this.dinero=new Dinero();
    }
    public void transfiereA(Cuenta c, int cantidad){
        System.out.println("Se transfirio "+cantidad+" a la cuenta "+c.nombre+" de "+c.cliente.nombre);
        this.retirar(cantidad);
        c.ingresar(cantidad);
    }
    public void recibeTransferencia(Cuenta c, int cantidad){
        c.retirar(cantidad);
        this.ingresar(cantidad);
    }
    public void mostrarDinero(){
        System.out.println(this.dinero.cantidad);
    }
    public void retirar(int cantidad){
        this.dinero.cantidad=this.dinero.cantidad-cantidad;
    }
    public void ingresar(int cantidad){
        this.dinero.cantidad=this.dinero.cantidad+cantidad;
    }
}
