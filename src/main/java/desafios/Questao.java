package desafios;

import java.util.Iterator;

/**
 * @author wtakashi / Willian Takashi
 * Todos os metodos foram feitas com algoritmo sem uso de classes para facilidades de transcrita em outra linguagem 
 */
public class Questao {
	private int[] bubbleSort(int[] arr) {
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
	public int questaoUm(int[] arr) {
		arr = bubbleSort(arr);
		return arr[(0+(arr.length-1))/2];
	}
	
	
	/*Dado um vetor de inteiros n e um inteiro qualquer x. 
	  Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.*/
	public int questaoDois(int[] arr) {
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
	public String questaoTres(String frase) {
		String stringFormatado = frase.replace(" ", "");
		if(stringFormatado.equals("")) {
			return "";
		}
		//Tirar todos os espaços da frase
		int tamanho = stringFormatado.length();
		
		//achar o resutado da raiz
		double resultado = Math.sqrt(tamanho);
		
		//Cast arredonda sempre para baixo
		int resultadoMenor = (int) resultado;
		int resultadoMaior = resultadoMenor + 1;
		
		//dividir as caracteres por resultador Maior
		String dividirPorResultadoMaior = "";
		for (int i = 0; i < tamanho; i++) {
			dividirPorResultadoMaior += stringFormatado.charAt(i);
			if((i+1)%resultadoMaior == 0) {
				dividirPorResultadoMaior += " ";
			}
		}
		
		//criptografar
		String[] resultadoRetorno = dividirPorResultadoMaior.toString().split(" ");
		String retorno = "";
		int aux=0;
		int contador = resultadoRetorno.length;
		for (int i = 0; i < resultadoRetorno[0].length(); i++) {
			if(resultadoRetorno[contador-1].length() < aux+1) {
				contador--;
			}
			for (int j = 0; j < contador; j++) {
				retorno += resultadoRetorno[j].charAt(aux);
			}
			retorno += " ";
			aux++;
		}
		retorno = retorno.substring(0, retorno.length() - 1);
		return retorno.toString();
	}
}
