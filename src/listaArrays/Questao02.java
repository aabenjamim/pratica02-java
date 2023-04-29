/* Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
e apresente também quantas foram as ocorrências da maior pontuação. */

package listaArrays;

import java.util.Random;

public class Questao02 {
    
    public static void main(String[] args){
        Random random = new Random();

        int[] lancamentos = new int[10];
        int soma = 0, maior = 0, contador = 0;
        double media = 0;

        for(int i=0; i<lancamentos.length; i++){
            lancamentos[i] = random.nextInt(6) + 1;
        }

        System.out.println("Os lançamentos foram: ");
        for (int lancamento : lancamentos) {
            System.out.println(lancamento + " ");
        }

        for(int i=0; i<lancamentos.length; i++){
            soma += lancamentos[i];
            if(lancamentos[i]>maior){
                maior = lancamentos[i];
            }
        }

        for(int i=0; i<lancamentos.length; i++){
            if(lancamentos[i] == maior){
                contador ++;
            }
        }

        media = soma/10;

        System.out.println("A média dos lançamentos foi: " + media);
        System.out.println("O número de ocorrências do maior valor foi: " + contador);


    }
}
