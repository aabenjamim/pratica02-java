/*Crie um programa que receba valores do usuário para 
preencher uma matriz 3X3, e em seguida, exiba a soma 
dos valores dela e a soma dos valores da primeira 
diagonal, ou seja, diagonal principal. */

package listaArrays;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        int[][] M = new int[3][3];
        Scanner entrada = new Scanner(System.in);
        int soma=0, diagonal=0;

        System.out.println("Digite os elementos da matriz: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                M[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Matriz: ");
        imprimeMatriz(M);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                soma += M[i][j];
                if(i==j){
                    diagonal += M[i][j];
                }
            }
        }

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A soma da diagonal é: " + diagonal);


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
