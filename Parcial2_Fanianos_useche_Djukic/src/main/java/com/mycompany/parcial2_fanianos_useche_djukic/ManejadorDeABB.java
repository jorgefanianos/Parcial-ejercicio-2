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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  

import java.util.ArrayList;
import java.util.Scanner;

public class ManejadorDeABB {

    
    public static void main(String[] args) {
        
        ArbolBinario arbol = new ArbolBinario();
        ArbolBinario arbol2 = new ArbolBinario();
       
        
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            
            System.out.println("Ingrese el numero correspondiente a la opcion que desea ejecutar:\n1 - Insertar Nodo arbol 1\n2 - Insertar nodo arbol 2\n3 - Comparar arboles\n");
        
            switch(sc.nextInt()) {

                case 1:
                    System.out.println("Ingrese la data del nodo en arbol 1 (numero entero):");
                    arbol.insertarNodo(arbol.getRaiz1(), new Nodo(sc.nextInt()));
                    break;
                case 2:
                    System.out.println("Ingrese la data del nodo en arbol 2 (numero entero):");
                    arbol2.insertarNodo(arbol2.getRaiz1(), new Nodo(sc.nextInt()));
                    break;
                case 3:
                    arbol.recorrerEnOrden(arbol.getRaiz1());
                    arbol2.recorrerEnOrden(arbol2.getRaiz1());
                    boolean isEqual = arbol.getValues().equals(arbol2.getValues());
                    if (isEqual) {
                        System.out.println("Si, los arboles binarios son iguales");
                    }else {
                        System.out.println("No, losa rboles binarios no son iguales");
                    }
                    break;
                default:
                    System.out.println("Opcion Invalida");

            }
            
        }
        
    }
    
}

