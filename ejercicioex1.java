/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package guia.pkg4;

import java.util.Random;



/**
 *
 * @author Usuario
 */
public class ejercicioex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que calcule la suma de todos
        los elementos de un vector de tamaño N, 
        con los valores ingresados por el usuario
        */
        Random dado = new Random();
        System.out.print("[ ");
        int len = 20;
        int suma=0;
        int[] numeros = new int[len];
        for (int i=0; i<=len-1; i++){
            numeros[i]= dado.nextInt(10);
            System.out.print(numeros[i]+" ");    
            suma+=numeros[i];
        }
        System.out.println(" ]");
        System.out.println(suma);
         
    }
    
}
