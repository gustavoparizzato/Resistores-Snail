package Util;

import java.util.ArrayList;
import java.util.List;

public class OrdemEspiral {

    public static List<Integer> ordenar(int[][] matrix) {
        List<Integer> resultado = new ArrayList<>();

        if (matrix == null || matrix.length == 0) { return resultado; }

        int cima = 0;
        int baixo = matrix.length - 1;
        int esquerda = 0;
        int direita = matrix[0].length - 1;

        while (cima <= baixo && esquerda <= direita) {
            // da esquerda para a direita
            for (int i = esquerda; i <= direita; i++) {
                resultado.add(matrix[cima][i]);
            }
            cima++;

            // de cima para baixo
            for (int i = cima; i <= baixo; i++) {
                resultado.add(matrix[i][direita]);
            }
            direita--;

            if (cima <= baixo) {
                // da direita para a esquerda
                for (int i = direita; i >= esquerda; i--) {
                    resultado.add(matrix[baixo][i]);
                }
                baixo--;
            }

            if (esquerda <= direita) {
                // de baixo para cima
                for (int i = baixo; i >= cima; i--) {
                    resultado.add(matrix[i][esquerda]);
                }
                esquerda++;
            }
        }
        return resultado;
    }
}