package br.com.luizfilie.ApiList.estruturadedados;

import java.util.Stack;

public class pilha {
    // LIFO (LAST IN, FIRST OUT)
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        for (int i = 0; i < 10; i++) {
            pilha.push(i);
        }
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
    }
}
