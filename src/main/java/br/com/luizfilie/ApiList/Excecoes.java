package br.com.luizfilie.ApiList;

import java.util.Scanner;

public class Excecoes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        var nome = scanner.nextLine();

        System.out.println(nome);

        int divisao = 0;
        try { // lidando com excecoes
            divisao = 10 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Divisao por zero");
        }finally {
            System.out.println("Isso executa toda vez");
        }
    }
}
