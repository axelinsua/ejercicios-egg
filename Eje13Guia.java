/*
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
 *de equipo y define su tipo de dato de tal manera que te permita alojar 
 *sus nombres más adelante.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author Franco MONLA
 */
public class Eje13Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String[] equipo = new String[4];
        
        System.out.println("1");
        equipo[0] = "Gustavo";
        System.out.println("2");
        equipo[1] = "Teresa";
        System.out.println("3");
        equipo[2] = "Ricky";
        System.out.println("4");
        equipo[3] = "Sil";
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);
        }
    }
    
}
