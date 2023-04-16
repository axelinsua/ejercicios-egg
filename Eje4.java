/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
 *y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
 *denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Guia5;

import java.util.Random;

/**
 *
 * @author Franco MONLA
 */
public class Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] mat = new int[4][4];
       Random ram = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = ram.nextInt(5);
            }
        }
        System.out.println("Matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
        transpuesta(mat);
    }
    public static int[][] transpuesta(int[][] mat){
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + mat[j][i] + "]");
            }
            System.out.println("");
        }
        return mat;
    }
}
