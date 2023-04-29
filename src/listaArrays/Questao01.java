/*Faça um programa que crie um vetor por leitura com 5 valores 
de pontuação de uma atividade e o escreva em seguida.
Encontre após a maior pontuação e a apresente.*/

package listaArrays;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] pontuacao = new double[5];

        for(int i=0; i<pontuacao.length; i++){
            System.out.println("Escreva uma pontuação: ");		
            pontuacao[i] = entrada.nextDouble();
        }

        double maior = pontuacao[0];

        for(int i=1; i<pontuacao.length; i++){
            if(pontuacao[i]>maior){
                maior = pontuacao[i];
            }
        }
        
		System.out.println("A maior pontuação é: " + maior);		
		
		entrada.close();
	}

}
