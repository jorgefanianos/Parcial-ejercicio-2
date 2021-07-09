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

import java.util.Scanner;

public class ManejadorDeABB {

    
    public static void main(String[] args) {
        
        ArbolBinario arbol = new ArbolBinario();
     
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            
            System.out.println("Ingrese el numero correspondiente a la opcion que desea ejecutar:\n1 - Insertar Nodo en el arbol \n2 - Ver la profundidad del arbol 2\n");
        
            switch(sc.nextInt()) {

                case 1:
                    System.out.println("Ingrese la data del nodo en el arbol  (numero entero):");
                    arbol.insertarNodo(arbol.getRaiz1(), new Nodo(sc.nextInt()));
                    break;
                case 2:
                    int profundidad = arbol.retornarAltura();
                    System.out.println("la profundidad es igual a:"+profundidad);
                    
                    break;
                default:
                    System.out.println("Opcion Invalida");

            }
            
        }
        
    }
    
}

