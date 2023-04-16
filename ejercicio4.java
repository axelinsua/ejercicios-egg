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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 3;
        int[][] cuadrado = new int[N][N];
        int suma = 0;
        int rep = 0;
        int rep2 = 0;
        boolean magico = true;
        int i;
        int j;
        genmat(cuadrado,N);
        for(i =0; i<=N-1; i++){
            suma = 0;
            rep = 0;
            rep2 = 0;
            for(j = 0; j<=N-1;j++){
                suma+=cuadrado[j][j];
                rep+=cuadrado[j][i];
                rep2+=cuadrado[i][j];
            }
            rep-=suma;
            rep2-=suma;
            magico = rep==0 && rep2==0;
            if(magico==false){
                break;
            }
        }
            
        i=0;
        j= N-1;
        
        while(j>=0 && i<=N-1 && magico==true ){
            rep+=cuadrado[i][j];
            i++;
            j--;
        }
        rep-=suma;
        magico = rep2==0 && 0==rep;
        if(magico==true){
            System.out.println("Su matriz es magica");
        }else{
            System.out.println("Su matriz no es magica");
            
        }
        mostmat(cuadrado,N);
    }
    
    public static void genmat(int mat[][], int N){
        //llamamos el scanner
        Scanner leer = new Scanner(System.in);
        // inicializamos el bucle para llenar la matriz
        for (int i = 0; i <= N-1; i++){
            for (int j = 0; j <= N-1; j++){
                System.out.println("ingrese un numero para la fila "+(i+1)+ " columna "+(j+1));
                mat[i][j]=leer.nextInt();
            }
        }
    }
    
    public static void mostmat(int mat[][], int N){
        for (int i = 0; i <= N-1; i++){
            System.out.println("");
            for (int j = 0; j <= N-1; j++){
                System.out.print(" ["+ mat[i][j]+" ]");
            }
        }
        System.out.println("\n\n ");
    }
}
