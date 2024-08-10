package br.com.luizfilie.ApiList.ordenacao;

import java.util.LinkedList;
import java.util.List;

public class BubleSort {

    public int[] bubleSort(int[] arr){
        int n = arr.length; // tam do array
        for (int i = 0; i < n-1; i++) { // itera ate o ultimo elemento
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){ // se j > j+1
                    int temp = arr[j]; // variavel auxiliar pra trocar o arr[j] com p arr[j+1]
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public int[] bubleSortExample(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    // O(n2) pior dos casos
    // O(n) melhor caso, lista ja ordenada

    public static void main(String[] args) {
        BubleSort bubleSort = new BubleSort();
        int[] arr = {1,5,2,4};

        System.out.println("Array antes da ordenacao");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        bubleSort.bubleSortExample(arr);

        System.out.println("Array depois da ordenacao");
        for (int num : arr){
            System.out.print(num + " ");
        }

    }
}
