/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author wjorellano
 */
public class Nodo {
    public int Dato;
    public Nodo sig;
    
    public Nodo(){
        sig = null;
    }
    
    public Nodo(int dato){
        Dato = dato;
        sig = null;
    }

    public Nodo(Nodo dato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
