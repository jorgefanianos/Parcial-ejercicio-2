/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial2_fanianos_useche_djukic;



/**
 *
 * @author jorgefanianos
 */
public class Nodo {
    
    private int data;
    
    private Nodo hijoIzquierdo;
    
    private Nodo hijoDerecho;
    
    public Nodo() {
        
    }
    

    public Nodo(int data) {
        
        this.data = data;
        
        this.hijoIzquierdo = null;
        
        this.hijoDerecho = null;
        
    }
    
    
    public int getData() {
        
        return this.data;
        
    }

    public void setData(int data) {
        
        this.data = data;
        
    }

    public Nodo getHijoIzquierdo() {
        
        return this.hijoIzquierdo;
        
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        
        this.hijoIzquierdo = hijoIzquierdo;
        
    }

    public Nodo getHijoDerecho() {
        
        return this.hijoDerecho;
        
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        
        this.hijoDerecho = hijoDerecho;
        
    }
    
    public void presentar(){
        
        System.out.println("( "+ this.data +" )");
        
    }
    
    public boolean esHoja(){
        
        return this.hijoIzquierdo == null && this.hijoDerecho == null;
    
    }
    
    public boolean equals(Nodo root1, Nodo root2) {
        boolean rootEqual = false;
        boolean lEqual = false;
        boolean rEqual = false;    

        if (root1 != null && root2 != null) {
            if (root1.getData() == root2.getData()) {
                rootEqual = true;
            }
            if (root1.getHijoIzquierdo()!=null && root2.getHijoIzquierdo() != null){
                lEqual = equals(root1.getHijoIzquierdo(), root2.getHijoIzquierdo());
            } 
            else if (root1.getHijoIzquierdo() == null && root2.getHijoIzquierdo() == null) {
                lEqual = true;
            }
            if (root1.getHijoDerecho() != null && root2.getHijoDerecho() != null) {
                
                rEqual = equals(root1.getHijoDerecho(), root2.getHijoDerecho());
            }
            else if (root1.getHijoDerecho() == null && root2.getHijoDerecho() == null) {
                rEqual = true;
            }

            return (rootEqual && lEqual && rEqual);
        }
        return false;
  
     }
   
    
}
