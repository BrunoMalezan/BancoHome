/*4) Um banco concederá um crédito especial aos seus clientes, de acordo com o 
saldo médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente 
e calcule o valor do crédito de acordo com a tabela abaixo. 
Mostre uma mensagem informando o saldo médio e o valor do crédito.
Saldo médio Percentual
de 0 a 200 = nenhum crédito
de 201 a 400 = 20% do valor do saldo médio
de 401 a 600 = 30% do valor do saldo médio
acima de 601 = 40% do valor do saldo médio*/

package apk;

import Controlador.Beneficio;

import java.util.Scanner;

public class Agencia {
	
	static Beneficio beneficio = new Beneficio();
	static Scanner entrada;
	static double media;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.print("Qual foi sua média de saldo nos ultimos 12 meses? = ");
		media = entrada.nextDouble();
		System.out.println(cliente(beneficio.tabela(media)));

	}
	
	static String cliente(double credito) {
		if(media <= 200) {
			return "Seu saldo médio foi de: " + media + "; Infelizmente voce não tera direito a credito especial...";
			
		} else {
			return "Seu saldo médio foi de: " + media + "; E seu crédito especial será de: " + credito;
			
		}
		
	}

}
