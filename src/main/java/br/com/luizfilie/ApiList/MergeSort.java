package br.com.luizfilie.ApiList;

import static java.io.ObjectInputFilter.merge;

public class MergeSort {
    public static void mergeSort(int[] array){
        if(array.length < 2){
            return;
        }
        // array = [1,2,3,4,5,6,7]
        int mid = array.length / 2; // meio
        int[] left = new int[mid]; // esquerdo
        int[] right = new int[array.length - mid]; // direito

        System.arraycopy(array, 0, left, 0, mid); // copiando pra substring left
        System.arraycopy(array, mid, right, 0, right.length); // copiando pra substring right

        mergeSort(left); // ordena por recursividade
        mergeSort(right);

        //Merge Sort divide a lista em sublistas menores,
        // ordena essas sublistas e as combina de forma ordenada.

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right){
        int i = 0, j = 0, k = 0;

        // array = [1,2,3,4k,5,6,7,8]
        // left = [1,2,3,4i]
        // right = [5j,6,7,8]
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                array[k++] = left[i++];
            }else{
                array[k++] = right[j++];
            }
        }

        while (i < left.length){
            array[k++] = left[i++];
        }

        while (j < right.length){
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Array antes da ordenação:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ordena o array
        mergeSort(array);

        System.out.println("Array depois da ordenação:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
