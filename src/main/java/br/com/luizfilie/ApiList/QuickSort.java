package br.com.luizfilie.ApiList;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high){
        if(low < high){
            int pi = partition(array, low, high);

            // [ 1, 2, 3, 4 ]
            // [1,2] [3,4]

            // ordena recursivamente
            quickSort(array, low, pi - 1); // sublista a esquerda
            quickSort(array, pi + 1, high); // sublista a direita
        }
    }

    private static int partition(int[] array, int low, int high) {
        // i = -1 [ 38, 27, 43, 3, 9, '82'j, 10high ]
        // [ 3, 27, 43, 38, 9, 82, 10 ] 1
        // [ 3, 9, 43, 38, 27, 82, 10 ] 2
        int pivot = array[high]; // ultimo elemento ['3']
        int i = (low - 1); // menor elemento ['0']

        for (int j = low; j < high; j++) {
            if(array[j] <= pivot){
                i++;

                int temp = array[i]; // variavel auxiliar
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // i = -1 [ 38, 27i, 43, 3, 9, '82'j, 10high ]
        // i = -1 [ 38, 27i, 10, 3, 9, '82'j, 43high ]
        // [ 3, 9, 10, 38, 27, 82, 43 ]
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Array antes da ordenacao");
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(array, 0, array.length - 1);

        System.out.println("Array depois da ordenacao");
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
