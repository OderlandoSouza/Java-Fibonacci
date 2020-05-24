package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;


public class DesafioApplication {
	public static List<Integer> fibonacci1() {

		ArrayList<Integer> fibonacci = new ArrayList<>();
		for (int i = 0; i < 350; i++) {
			int numero;
			//= (i >= 2) ? i - 2 : 0;
			if (i >= 2) {
				numero = i - 2;
			} else {
				numero = 0;
			}

			if (i > 1) {
				int num1 = fibonacci.get(numero);
				numero++;
				int num2 = fibonacci.get(numero);
				fibonacci.add(num1 + num2);
			} else {
				fibonacci.add(i);
			}


			if (fibonacci.get(i) > 350) {
				break;
			}

		}
		return fibonacci;
	}


	public static Boolean isFibonacci(Integer numero) {
		return fibonacci1().contains(numero);
	}

	public static void main(String[] args) {
		System.out.println(isFibonacci(13));

	}
}

