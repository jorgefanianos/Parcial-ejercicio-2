/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial2_fanianos_useche_djukic;

import java.util.ArrayList;

/**
 *
 * @author jorgefanianos
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ArbolBinario {
    
    private Nodo raiz;
    private ArrayList<Number> values;
    public ArrayList<Number> listValues = new ArrayList();

    public ArrayList<Number> getValues() {
        return values;
    }

    public void setValues(ArrayList<Number> values) {
        this.values = values;
    }

    
    public Nodo getRaiz1() {
        
        return this.raiz;
        
    }

    public void setRaiz(Nodo raiz) {
        
        this.raiz = raiz;
        
    }
    
    public boolean estaVacio() {
        
        return this.raiz == null;
        
    }

    public void insertarNodo(Nodo aux, Nodo nuevo) {
        
        if (estaVacio()) {
            
            this.raiz = nuevo;
            
        }else if (nuevo.getData() < aux.getData()) {
            
            if (aux.getHijoIzquierdo() == null) {
                
		aux.setHijoIzquierdo(nuevo);
                
            }else {
                
                this.insertarNodo(aux.getHijoIzquierdo(), nuevo);
                
            }
            
        }else if (nuevo.getData() > aux.getData()) {
            
            if (aux.getHijoDerecho() == null) {
                
		aux.setHijoDerecho(nuevo);
                
            }else {
                
		this.insertarNodo(aux.getHijoDerecho(), nuevo);
                
            }
            
        }else{
            
            System.out.println("Dicho nodo ya se encuentra dentro del árbol");
            
        }
        
    }
    
        public void recorrerEnOrden(Nodo aux) {
        if(aux != null){
            this.recorrerEnOrden(aux.getHijoDerecho());
            this.recorrerEnOrden(aux.getHijoIzquierdo());
            this.listValues.add(aux.getData());
            this.setValues(listValues);
             
        }
        
    }

}

