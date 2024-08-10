package br.com.luizfilie.ApiList.abstracao;

import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("List padrao");
        for (String letter : list){
            System.out.print(letter + " ");
        }
        System.out.println();

        list.addFirst("E");
        System.out.println("List add First element");
        for (String letter : list){
            System.out.print(letter + " ");
        }
        System.out.println();

        list.removeFirst();
        System.out.println("List Removed first element");
        for (String letter : list){
            System.out.print(letter + " ");
        }
        System.out.println();
    }
}
