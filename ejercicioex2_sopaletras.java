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
public class ejercicioex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
        caracteres y, a medida que el usuario las va ingresando, construya 
        una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
        Las palabras se ubicarán todas en orden horizontal en una fila que 
        será seleccionada de manera aleatoria. Una vez concluida la ubicación
        de las palabras, rellene los espacios no utilizados con un número 
        aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de 
        letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan
        las siguientes funciones de Java substring(), Length() y Math.random().
        */
        //se importa el scanner para poder ingresar las palabras
        
        Scanner leer= new Scanner(System.in);
        //sopa de letras
        char[][] sopaLetras= new char[20][20];
         
       
        //palabra 1
        System.out.println("Ingrese una palabra1 de  entre 3 y 5 letras");
        String palabra1=leer.next();
        while(palabra1.length()<3 || palabra1.length()>5){
         System.out.println("ERROR Ingrese una palabra1 de  entre 3 y 5 letras");
         palabra1=leer.next();  
       }
       //palabra2
       System.out.println("Ingrese una palabra2 de  entre 3 y 5 letras");
       String palabra2=leer.next();
       while(palabra2.length()<3 || palabra2.length()>5){
         System.out.println("ERROR Ingrese una palabra2 de  entre 3 y 5 letras");
         palabra2=leer.next();  
       }
       //palabra3
       System.out.println("Ingrese una palabra3 de  entre 3 y 5 letras");
       String palabra3=leer.next();
       while(palabra3.length()<3 || palabra3.length()>5){
         System.out.println("ERROR Ingrese una palabra3 de  entre 3 y 5 letras");
         palabra3=leer.next();  
       }
       //palabra4
       System.out.println("Ingrese una palabra4 de  entre 3 y 5 letras");
       String palabra4=leer.next();
       while(palabra4.length()<3 || palabra4.length()>5){
         System.out.println("ERROR Ingrese una palabra4 de  entre 3 y 5 letras");
         palabra4=leer.next();  
       }
       //palabra5
       System.out.println("Ingrese una palabra5 de  entre 3 y 5 letras");
       String palabra5=leer.next();
       while(palabra5.length()<3 || palabra5.length()>5){
         System.out.println("ERROR Ingrese una palabra5 de  entre 3 y 5 letras");
         palabra5=leer.next();  
       }
       //array con todas las palabras
       String[] palabras = {palabra1, palabra2, palabra3, palabra4, palabra5};
       
       
       //aca colocamos las distintas palabras en la sopa de letras
       // String palabra : palabras ---> esto significa que el bucle for ira
       //------------------------------> yendo elemento por elemento (palabra a palabra)
       //------------------------------> dentro del array de palabras
       for ( String palabra : palabras){
           //esta funcion esta explicada mas abajo
           colocarpalabraensopa(sopaLetras, palabra);
       }
       //tener en cuenta que hasta aqui la sopa de letras solo contiene las palabras distribuidas en la sopa
       //pero el resto de los lugares del array que no traen la letra de ninguna palabra tendran el valor 0
       //en caracter
       
       //aqui solo imprimimos la sopa de letras
       for (int i = 0; i < 20; i++){
           System.out.println("");
           for (int j = 0; j < 20; j++){
               //este condicional representa que aquellos lugares donde no se ha
               //colocado una letra de una palabra, se colocara una 'c' de lo contrario
               //se deja la letra que ya se cargo con la funcion anterior (seria una parte de la palabra)
               if(sopaLetras[i][j]==0){
                   sopaLetras[i][j]=(char)('a'+Math.random()*26);
               }
               System.out.print(sopaLetras[i][j]+" ");
           }
       }
       
        System.out.println("\n\n");
       
       
    }
    public static void colocarpalabraensopa(char[][] sopaLetras, String palabra){
        boolean colocada = false;
        //mientras la palabra no este colocada
        while (!colocada){
            //indicamos la fila de la primera letra de nuestra palabra
            int filainicial = (int)(Math.random()*20);
            //indicamos la columna de la primera letra de nuestra palabra
            int columnainicial = (int)(Math.random()*20);
            //hay un 50% de chances de que la palabra se coloque verticalmente (si es menor a 0.5)
            boolean vertical = Math.random()<0.5;
            //en caso que vertical sea mayor a 0.5 o igual la palabra ira horizontalmente
            boolean horizontal = !vertical;
            //si vertical es true direccion fila es 1 (if (vertical == true){ direccionfila =1 }else{direccionfila =0})
            //?--> if (true)
            //:--> else (son dos puntos no sean mal pensados)
            int direccionfila = vertical ? 1:0;
            //si vertical es false direccion columna es 1
            int direccioncolumna =horizontal ? 1:0;
            //guardamos la longitud de la palabra en una variable
            int longitudPalabra = palabra.length();
            //inicializamos el booleano de si este lugar ya esta ocupado por otra palabra en false
            boolean solapa = false;
            // bucle para pasar por cada letra de la palabra
            for (int i=0; i < longitudPalabra; i++){
                //si vertical = true la fila siempre sera la misma tras este calculo pq direccionfila es 0
                int fila = filainicial+i*direccionfila;
                //de lo contrario columna sera siempre la misma tras este calculo pq la direccioncolumna es 0 
                int columna = columnainicial+i*direccioncolumna;
                /*
                si la fila es mayor a 19 o 
                la culumna es mayor a 19 o 
                ese lugar del array no esta vacio por falta de caracteres y 
                ese lugar del array es distinto a la letra que queremos ubicar alli
                entoces no podemos ubicar
                por ello no nos interesa seguir en este bucle for y querremos reintentar
                solapa sera verdadero
                */
                if (fila >=20 || columna >=20 || sopaLetras[fila][columna] != 0 && sopaLetras[fila][columna]!= palabra.charAt(i)){
                    solapa=true;
                    break;
                }
            }
            //si solapa no es verdadero entonces generaremos un bucle con la longitud de la palabra
            if(!solapa){for(int i =0 ; i < longitudPalabra; i++){
                //crearemos de vuelta las variables fila y columna para el mismo proposito que la vez anterior
                //que se genere la direccion de la palabra con el incremento de la variable culla direccion conlleva
                //si sera escrita en una columna o en una fila
                //vertical o horizontal
                  int fila = filainicial+i*direccionfila;
                  int columna = columnainicial+i*direccioncolumna;
                //con los datos anteriores iremos poniendo letra a letra en forma de caracter(char)
                //en las filas o columnas que se vayan generando
                  sopaLetras[fila][columna] = palabra.charAt(i);
                  }
            //antes de cerrar el if y una vez cerrado el for, si esto se pudo realizar quiere decier que esta palabra ya fue ubicada
            //y se puede terminar el bucle while
            colocada = true;
            }
        }
  }
}
    
    
    

