package br.com.luizfilie.ApiList.excecoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExcecaoExemplo {
    // verificadas
    // nao verificadas

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Arquivo.txt");
            BufferedReader fileInput = new BufferedReader(reader);

            System.out.println(fileInput);
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int divisao = 0;
        try {
            divisao = 10 / 0;
            System.out.println(divisao);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }finally {
            divisao = 5;
            System.out.println(divisao);
        }
    }
}
