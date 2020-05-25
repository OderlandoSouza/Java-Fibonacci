package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

//puclic class main + nome da classe
public class Main {

    //cria uma lista "fibonacci1"
    public static List<Integer> fibonacci1() {

        //cria e instancia um ArrayList "fibonacci"
        ArrayList<Integer> fibonacci = new ArrayList<>();

        //cria for, inicia com 0, ate 350, incrementa 1
        for (int i = 0; i < 350; i++) {
            int numero;

            //se i > 1, a variavel numero recebe o valor de i-2
            if (i > 1) {
                numero = i - 2;

                //se nao, numero recebe valor de i
            } else {
                numero = i;
            }

            //se i > 1, num1 recebe o valor da posicao "numero" / num2 recebe o valor da posicao "numero++" / add num1 + num2 na ArrayList fibonacci
            if (i > 1) {
                int num1 = fibonacci.get(numero);

                numero++;
                int num2 = fibonacci.get(numero);

                fibonacci.add(num1 + num2);
                //System.out.println(fibonacci);


            } else {
                fibonacci.add(i);

            }

            if (fibonacci.get(i) > 350) {
                break;

            }

        }

        return fibonacci;

    }

    public static boolean isFibonacci (int numero) {
        return fibonacci1().contains(numero);
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(5));
        //System.out.println(fibonacci1());
    }
}
