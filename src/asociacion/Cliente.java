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
public class Cliente {
    public Direccion d1;
    public String nombre;
    public Cuenta[] cuentas= new Cuenta[10];
    static int n=0;
    public Cliente(){
        d1=new Direccion();
        nombre=" ";
    }
    public Cliente(String d, String nombre){
        d1=new Direccion(d);
        this.nombre=nombre;
    }
    public void mostrarDireccion(){
        System.out.println(this.d1);
    }
    public void agregarCuenta(String nombre){
        cuentas[n]=new Cuenta(nombre,this);
        n++;
    }
}
