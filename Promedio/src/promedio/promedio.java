/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Double matriz [][] = new Double[4][4];
       Scanner teclado=new Scanner(System.in);
       Double suma = 0.0;
       
       for(int f=0;f<4;f++){
           for(int c=0;c<3;c++){
               System.out.println("Ingrese el numero de alumno N° "+ f);
               matriz[f][c] = teclado.nextDouble();
               suma = suma + matriz[f][c];
           }
           matriz[f][3] = suma /3;
           suma = 0.0;
       }
       
       for(int f=0;f<4;f++){
        System.out.println("Las notas del alumno N° "+ f + "son: ");
        for(int c=0; c<3;c++){
            System.out.println(" nota N° "+ c + " "+ matriz[f][c]);
        }
        System.out.println("el promedio de las notas es: " + matriz[f][3]);
    }
    }
    
}
