package br.com.luizfilie.ApiList;

import java.util.*;

public class ListNumbers {
    //Escreva um programa em Java que leia uma lista de números
    // inteiros e retorne a soma dos números ímpares dessa lista.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaNumbers = new ArrayList<>();

        int opcao;
        int soma = 0;

        do {
            System.out.println("Deseja adicionar mais um numero: (1- sim, 0- nao) ");
            opcao = scanner.nextInt();
            if (opcao != 0) {
                System.out.println("Informe os numeros da lista");
                int numero = scanner.nextInt();
                listaNumbers.add(numero);
            }
        } while (opcao != 0);

        System.out.println("1- soma, 2 - ordenar");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                for (int n : listaNumbers) {
                    if (n % 2 == 0) {
                        soma += n;
                    }
                }
                break;
            case 2:
                Collections.sort(listaNumbers);
                break;
            default:
                System.out.println("opcao invalida");

        }

        System.out.println("lista: " + listaNumbers);
        System.out.println("soma dos numeros da lista: " + soma);
    }

}
