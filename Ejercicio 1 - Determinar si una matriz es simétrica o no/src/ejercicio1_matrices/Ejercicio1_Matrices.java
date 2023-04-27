/*
Ejercicio1: Crear y cargar una matriz de tamaño n*m y decir si es simetrica o no.
 */
package ejercicio1_matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1_Matrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFil, nCol;
        boolean simetrica = true;

        nFil = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));

        matriz = new int[nFil][nCol];

        System.out.println("Digite una matriz: ");
        for (int i = 0; i < nFil; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        if (nFil == nCol) {//Si el numero de filas es igual al numero de columnas.

            int i, j;
            i = 0;
            while (i < nFil && simetrica == true) {
                j = 0;
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if (simetrica == true) {
                JOptionPane.showMessageDialog(null, "La matriz es simetrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }

        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
        }

    }
}
