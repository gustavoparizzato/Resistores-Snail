import Util.OrdemEspiral;

public class Main {
    public static void main(String[] args) {

        // Exemplo 1:
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(OrdemEspiral.ordenar(matrix1));

        // Exemplo 2:
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 10, 12},
                {6, 7, 33}
        };
        System.out.println(OrdemEspiral.ordenar(matrix2));

        // Meu Exemplo:
        int[][] matrix3 = {
                {1, 2, 3, 4},
                {5, 10, 12, 7},
                {6, 7, 33, 8},
                {11, 15, 18, 0}
        };
        System.out.println(OrdemEspiral.ordenar(matrix3));

        // Exemplo de matriz vazia:
        int[][] matrix = {};
        System.out.println(OrdemEspiral.ordenar(matrix));
    }
}