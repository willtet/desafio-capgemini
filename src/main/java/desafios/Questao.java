package desafios;

import java.util.Iterator;

public class Questao {
	public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
        	for (int j = 0; j < arr.length-i-1; j++) {
        		if (arr[j] > arr[j+1]){
        			int aux = arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = aux;
        		}
        	}
        }
		return arr;
	}
	
	/*A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. 
	Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.*/
	public static int questaoUm(int[] arr) {
		arr = bubbleSort(arr);
		return arr[(0+(arr.length-1))/2];
	}
	
	
	/*Dado um vetor de inteiros n e um inteiro qualquer x. 
	  Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.*/
	public static int questaoDois(int[] arr) {
		int aux = 0;
		for (int i = 0; i < arr.length-1; i++) {
        	for (int j = i+1; j < arr.length; j++) {
        		if(arr[i]>arr[j]) {
        			if(arr[i]-arr[j] == 2) {
        				aux++;
        			}
        		}else {
					if(arr[j]-arr[i] == 2) {
						aux++;
					}
        		}
        	}
        }
		return aux;
	}
	
	
	/*Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.*/
	public static String questaoTres(String frase) {
		
		String stringFormatado = frase.replace(" ", "");
		int tamanho = stringFormatado.length();
		
		double resultado = Math.sqrt(tamanho);
		
		//Cast arredonda sempre para baixo
		int resultadoMenor = (int) resultado;
		int resultadoMaior = resultadoMenor + 1;
		
		StringBuilder dividirPorResultadoMaior = new StringBuilder();
		for (int i = 0; i < tamanho; i++) {
			dividirPorResultadoMaior.append(stringFormatado.charAt(i));
			if((i+1)%resultadoMaior == 0) {
				dividirPorResultadoMaior.append(" ");
			}
		}
		
		String[] resultadoRetorno = dividirPorResultadoMaior.toString().split(" ");
		StringBuilder retorno = new StringBuilder();
		int aux=0;
		for (int i = 0; i < resultadoRetorno.length; i++) {
			for (int j = 0; j < resultadoRetorno[i].length(); j++) {
				
			}
			retorno.append(resultadoRetorno[i].charAt(aux));
		}
		return retorno.toString();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 4, 2};
		System.out.println(questaoTres("tenh aumb omdi a"));
	}
}
