/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de 
mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos são as diferenças dos elementos 
de mesma posição das matrizes N1 e N2.*/


package listaArrays;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        int[][] N1 = new int[4][6];
        int[][] N2 = new int[4][6];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os elementos de N1: ");
        for(int i=0; i<4; i++){
            for(int j=0; j<6; j++){
                N1[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Matriz N1: ");
        imprimeMatriz(N1);


        System.out.println("Digite os elementos de N2: ");
        for(int i=0; i<4; i++){
            for(int j=0; j<6; j++){
                N2[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Matriz N2: ");
        imprimeMatriz(N2);


        int[][] M1 = new int[4][6];

        for(int i=0; i<4; i++){
            for(int j=0; j<6; j++){
                M1[i][j] = N1[i][j] + N2[i][j];
            }
        }
        System.out.println("Matriz M1: ");
        imprimeMatriz(M1);


        int[][] M2 = new int[4][6];

        for(int i=0; i<4; i++){
            for(int j=0; j<6; j++){
                M2[i][j] = N1[i][j] - N2[i][j];
            }
        }
        System.out.println("Matriz M2: ");
        imprimeMatriz(M2);

        entrada.close();

    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
