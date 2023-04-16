/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
 *y le pida al usuario un número a buscar en el vector. El programa mostrará 
 *dónde se encuentra el numero y si se encuentra repetido
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Franco MONLA
 */
public class Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su vector");
        int largo = read.nextInt();
        int vector[] = new int[largo];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(10);
        }
        System.out.println("Que numero desea buscar en el arreglo");
        int num = read.nextInt();
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                System.out.println("Se encuentra en la posicion:" + i);
                cont++;
            }
        }
        System.out.println("Se repite " + cont + " veces");
    }
    
}
