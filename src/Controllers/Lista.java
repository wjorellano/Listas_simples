/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import javax.swing.JOptionPane;

import Models.Nodo;

/**
 *
 * @author wjorellano
 */
public class Lista {
    private Nodo L;
    int min = 100, fin = 200;

    public Lista() {
        L = null;
    }

    public void Exit(){
        System.exit(0);
    }
    public void Imprimir() {
        Nodo p = L;
        System.out.println("=======================");
        System.out.println("=========== Datos de la lista ============");

        while (p != null) {
            System.out.println("Dir: " + p + "Dato: " + p.Dato + "Sig: " + p.sig);
            p = p.sig;
        }
        System.out.println("========================");
    }

    public void InsertarInicio(int dato) {
        Nodo x = new Nodo(dato);
        x.sig = L;
        L = x;
    }

    public void ElmentoImpar() {
        Nodo p = L;

        while (p != null) {
            if (p.Dato % 2 != 0) {
                System.out.println("Elememtos impares: " + p.Dato);
            }
            p = p.sig;
        }
    }

    public void PosicionPar() {
        Nodo p = L;
        int cont = 1;
        while (p != null) {
            if (cont % 2 == 0) {
                System.out.println(p.Dato);
            }
            cont++;
            p = p.sig;
        }
    }
    
        public int Size() {
        Nodo p = L;
        int cont = 1;
        while (p != null) {
            cont++;
            p = p.sig;
        }
        System.out.println("la cantidad es: " + cont);
        return cont;
    }

    public Nodo UltimaPosicion() {
        Nodo p = L;        
        while (p != null){
            if(p.sig == null){
                return p;
            }
            p = p.sig;
        }
        return null;
    }


    public void InsertarPosicion(int dato, int posicion) {
        Nodo x = new Nodo(dato);
        Nodo p = L;
        int cont = 1;
        if (posicion == 1) {
            x.sig = L;
            L = x;
        } else {
            while (cont < posicion - 1) {
                p = p.sig;
                cont++;
            }
            x.sig = p.sig;
            p.sig = x;
        }
    }

    public  void Promedio(){
        Nodo p = L;
        int suma = 0;
        int cont = 0;
        float promedio;

        while(p != null){
            suma += p.Dato;
            cont++;
            p = p.sig;
        }
        promedio = suma / cont;
        System.out.println("El promedio es: " + promedio);

    }

    public void ElememtoMayor() {
        Nodo p = L;
        int mayor = p.Dato;
        while (p != null) {
            if (p.Dato > mayor) {
                mayor = p.Dato;
            }
            p = p.sig;
        }
        System.out.println("El elemento mayor es: " + mayor);
    }

    public void ElememtoMenor() {
        Nodo p = L;
        int mayor = p.Dato;
        while (p != null) {
            if (p.Dato < mayor) {
                mayor = p.Dato;
            }
            p = p.sig;
        }
        System.out.println("El elemento menor es: " + mayor);
    }

    public Nodo Buscar(int dato) {
        Nodo p = L;
        while (p != null) {
            if (p.Dato == dato) {
                return p;
            }
            p = p.sig;
        }
        System.out.println("El elemento no se encuentra en la lista");
        return null;
    }
    public void InsertarAntes(Nodo D){
        Nodo x = new Nodo(D);
        if(L==null){
            L = x;
        }else{
            x.sig = L;
        // L.Dato = x;
            L = x;

        }
    }
    
    public void InsertarFinal(int dato) {
        Nodo x = new Nodo(dato);
        Nodo u = UltimaPosicion();
        if (u != null) {
            u.sig = x;
        } else {
            L = x;
        }

    }

    public void insertarFinalRandom(int n) {
        for (int i = 0; i < n; i++) {
            InsertarFinal((int) (min + (fin) * Math.random()));
        }
    }



    public void OrdenarLista(){
        Nodo p = L;
        Nodo q;

        while(p != null){
            q=p.sig;
            while(q != null){
                if(p.Dato > q.Dato){
                    int aux = p.Dato;
                    p.Dato = q.Dato;
                    q.Dato = aux;
                }
                q = q.sig;
            }

            p = p.sig;
        }
        Imprimir();
    }

    public Nodo Anterior(Nodo q) {
        Nodo p = L;
        while (p != null) {
            if (p.sig == q) {
                p = p.sig;
                return p;
            }
        }
        return null;
    }

    public void Eliminar(int dato){
        Nodo x = Buscar(dato);
        if(x != null){
            if(x == L){
                L = L.sig;
            }else{
                Nodo ax = Anterior(x);
                ax.sig = x.sig;
            }
            x.sig = null;
            System.out.println("Eliminado correctamente");
        }else{
            System.out.println("no existe");
        }
    }

    // public void InsertarDespues(int dato, int ref){
    //     Nodo b = buscar(ref);
    //     if(b != null){
    //         if(b.sig == null){
    //             InsertarFinal(dato);
    //         }else{
    //             Nodo x = new Nodo(dato);
    //             x.sig = b.sig;
    //             b.sig = x;
    //         }
    //     }else{
    //         JOptionPane.showInternalMessageDialog(null, "Error de  dato");
    //     }
    //}


}
