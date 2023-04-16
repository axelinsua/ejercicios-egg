/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que llene un vector de tamaño N con 
        valores aleatorios y le pida al usuario un número a buscar en el vector.
        El programa mostrará dónde se encuentra el numero y si se encuentra 
        repetido
        */
        
        //inicializacion de variables y vector
        Random dado = new Random();
        Scanner leer = new Scanner(System.in);
        int N=5;
        int[] valores = new int[N];
        int numero;
        int contador = 0;
        int i;
        //generamos los numeros aleatorios 
        for( i=0; i<=N-1; i++ ){
            valores[i]=dado.nextInt(6);
        }
        //se le pide el numero al usuario
        System.out.println("Ingrese un numero para averiguar si este esta en el vector");
        numero = leer.nextInt();
        
        //verificamos si el numero esta en el vector 
        for( i=0 ; i<=N-1 ; i++){
            if(numero == valores[i]){
                System.out.println("La posicion de este numero en el vector es "+i);
                //el contador nos dira si el numero se repite dentro del vector
                contador++; // esto es igual a contador = contador + 1 o contador += 1
            }
            
        }
        //nos dice si el numero esta repetido o no
        if(contador>=2){
            System.out.println("el numero se repite "+ contador+ " veces ");
        }else if(contador==1){
            System.out.println("El numero esta en el vector");
        }else{
            System.out.println("Segui participando");
        }
        
        //se imprime el vector por pantalla 
         for( i=0; i<=N-1; i++ ){
             System.out.println(valores[i]+" "); 
        }
        
    
    }
}
