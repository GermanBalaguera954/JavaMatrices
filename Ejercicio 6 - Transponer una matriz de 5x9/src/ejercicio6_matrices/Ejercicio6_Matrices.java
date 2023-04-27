/*
Ejercicio6: Utilizando dos matrices de tamaño 5*9 y 9*5, cargar la primera y transponerla
en la segunda.
 */
package ejercicio6_matrices;

import java.util.Scanner;

public class Ejercicio6_Matrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        int matriz1[][], matriz2[][];
        
        matriz1 = new int [5][9];
        matriz2 = new int [9][5];
        
        System.out.println("Digite la matriz: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("matriz["+i+"]["+j+"]: ");
                matriz1[i][j]= entrada.nextInt();
            }
        }
        
        System.out.println("La matriz original es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Trasponemos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i]=matriz1[i][j];
            }
        }
        
        System.out.println("\nLa matriz traspuesta es: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j] +" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
