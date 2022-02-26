/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1factorial;
import java.util.Scanner;
/**
 *
 * @author stephany GA
 */
public class Lab1Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     //atraves scanner del la libreria java.util tomaremos la lectura del teclado para los numeros
     Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero que quiera tener  su factorial: ");
        //ocupando el metodo (.nextInt) para leer los datos tipos int
        int numeroR = sc.nextInt();
        sc.close();
         
        System.out.println("\nEl factorial de " + numeroR + " es: " + factorial(numeroR));
    }
     
    public static int factorial(int numeroR){
        if(numeroR == 0){
            return 1;
        }
        else
            return numeroR * factorial(numeroR-1);
    }
    }
    

