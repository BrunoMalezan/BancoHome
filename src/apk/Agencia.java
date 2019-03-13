/*4) Um banco conceder� um cr�dito especial aos seus clientes, de acordo com o 
saldo m�dio no �ltimo ano. Fa�a um algoritmo que leia o saldo m�dio de um cliente 
e calcule o valor do cr�dito de acordo com a tabela abaixo. 
Mostre uma mensagem informando o saldo m�dio e o valor do cr�dito.
Saldo m�dio Percentual
de 0 a 200 = nenhum cr�dito
de 201 a 400 = 20% do valor do saldo m�dio
de 401 a 600 = 30% do valor do saldo m�dio
acima de 601 = 40% do valor do saldo m�dio*/

package apk;

import Controlador.Beneficio;

import java.util.Scanner;

public class Agencia {
	
	static Beneficio beneficio = new Beneficio();
	static Scanner entrada;
	static double media;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.print("Qual foi sua m�dia de saldo nos ultimos 12 meses? = ");
		media = entrada.nextDouble();
		System.out.println(cliente(beneficio.tabela(media)));

	}
	
	static String cliente(double credito) {
		if(media <= 200) {
			return "Seu saldo m�dio foi de: " + media + "; Infelizmente voce n�o tera direito a credito especial...";
			
		} else {
			return "Seu saldo m�dio foi de: " + media + "; E seu cr�dito especial ser� de: " + credito;
			
		}
		
	}

}
