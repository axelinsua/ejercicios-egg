/*
 Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci.
Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor de “n” y
que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: 
 */
package guia5;

import java.util.Scanner;

public class clase11Eje7Ext {

    public static void main(String[] args) {
        int n;
        int num = 1, aux = 1;

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un numero de la sucesion fibonacci: ");
        n = read.nextInt();

        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                vector[i] = 1;
            } else {
                vector[i] = vector[i-1] + vector[i-2];
            }
            System.out.print("[" + vector[i] +"]");
        }
        
        
    }

}
