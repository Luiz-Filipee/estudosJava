package br.com.luizfilie.ApiList;

import java.util.Arrays;

public class TempoExecution {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        long startTime = System.nanoTime();
        for (int i = 0; i < numeros.length; i++) {
            Arrays.stream(numeros).filter(n -> n % 2 == 0);
        }
        long endTime = System.nanoTime();
        System.out.println("Tempo de execucao: " + (endTime - startTime) + " ns");

    }
}
