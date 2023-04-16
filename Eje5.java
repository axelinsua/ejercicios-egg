/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica.
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 *traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 *sus filas por columnas (o viceversa).
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Franco MONLA
 */
public class Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ram = new Random();
        Scanner read = new Scanner(System.in);
        int[][] mat = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("[" + i + "]" + "[" + i + "]");
               mat[i][j] = read.nextInt();
            // mat[i][j] = ram.nextInt(5) * (ram .nextBoolean() ? -1 : 1);
            }
        }
        System.out.println("Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + mat[j][i] + "]");
            }
            System.out.println("");
        }
        verif(mat);
    }
    public static void verif(int[][] mat){
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] == (mat[j][i]*-1)) {
                    cont++;
                }
            }
        }
        if (cont == 3*3) {
            System.out.println("Su matriz es Antisimetrica");
        }
        else{
            System.out.println("Su matriz no es Antisimetrica");
        }
    }
}
