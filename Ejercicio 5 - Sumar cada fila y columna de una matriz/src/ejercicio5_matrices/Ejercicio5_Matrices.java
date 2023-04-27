/*
Ejercicio5: Crear y cargar una matriz de tamaño n*m, mostrar la suma de cada fila y de
cada columna.
 */
package ejercicio5_matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5_Matrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], numFil, numCol, sumaFil, sumaCol;

        numFil = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        numCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));

        matriz = new int[numFil][numCol];

        System.out.println("Digite la matriz");
        for (int i = 0; i < numFil; i++) {
            for (int j = 0; j < numCol; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < numFil; i++) {
            for (int j = 0; j < numCol; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        //Ahora procedemos a sumar las filas
        System.out.print("\nSuma de Filas: ");
        for (int i = 0; i < numFil; i++) {
            sumaFil = 0;
            for (int j = 0; j < numCol; j++) {
                sumaFil += matriz[i][j];
            }
            System.out.print("\nLa suma de la fila[" + i + "] es: " + sumaFil);
        }
        System.out.println("");

        //Ahora procedemos a sumar las columnas
        System.out.print("\nSuma de Columnas: ");
        for (int j = 0; j < numCol; j++) {
            sumaCol = 0;
            for (int i = 0; i < numFil; i++) {
                sumaCol += matriz[i][j];
            }
            System.out.print("\nLa suma de la Coloumna[" + j + "] es: " + sumaCol);
        }
        System.out.println("");
    }
}
