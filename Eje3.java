/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Franco MONLA
 */
public class Eje3 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random Aletorio = new Random();
        
        System.out.print("Ingrese el tamaño del vector: ");
        int N = sc.nextInt();
        int[] vector = new int[N];
        int[] vectorCont = new int[5];
        for (int i = 0; i < N; i++) {
            vector[i] = Aletorio.nextInt(100000);
        }
       
        for (int i = 0; i < N; i++) {
            String numero = Integer.toString(vector[i]);
            int digitos = numero.length();
            vectorCont[digitos-1] = vectorCont[digitos-1] +1;
            //System.out.println(" - " + vector[i] + " - ");
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Números de " + (i+1) + " dígito: " + vectorCont[i]);
    }
    }

}
