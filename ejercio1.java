/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que llene un vector con los 100
        primeros números enteros y los muestre por
        pantalla en orden descendente.
        */
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[100];
        for (int i = 0; i<=99; i++ ){
            numeros[i]=(i+1);
        }
        for (int i = 99; i>=0; i-- ){
            System.out.print(" [ "+numeros[i]+" ] "); 
        }
        System.out.println("\n");
    }
    
}
