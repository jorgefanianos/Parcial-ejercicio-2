/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author jorgefanianos
 */
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
    private int altura;

    public int getAltura() {
        return altura;
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
    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    private void retornarAltura(Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.getHijoIzquierdo(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.getHijoDerecho(), nivel + 1);
        }
    }
 

}
