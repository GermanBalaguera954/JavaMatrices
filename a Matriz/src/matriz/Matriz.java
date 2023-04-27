package matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));

        matriz = new int[nFilas][nCol];

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nLa matriz es:  ");
        for (int i = 0; i < nFilas; i++) {//Numero de filas.
            for (int j = 0; j < nCol; j++) {//Numero de columnas.
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

}
