package br.com.luizfilie.ApiList.estruturadedados;

public class BuscaBinaria {
    public int buscaBinaria(int[] array, int x){
        int esquerda = 0, direita = array.length-1;

        while(esquerda <= direita){ // esquerda = 0, direita = 3
            // meio = 0 + (3 - 0) / 2
            int meio = esquerda + (direita - esquerda) / 2;
            if(array[meio] == x)
                return meio;
            if(array[meio] < x)
                esquerda = meio + 1;
            else
                direita = meio - 1;
        }
        return -1;
    }

    private int searchBinary(int[] array, int x){
        int esquerda= 0, direita  = array.length - 1;
        while(esquerda <= direita){
            int meio = esquerda + (direita - esquerda) / 2;
            if(array[meio] == x)
                return meio;
            if(array[meio] < x)
                esquerda = meio + 1;
            else
                direita = meio - 1;
        }
        return  -1;
    }

    public static void main(String[] args) {
        BuscaBinaria buscaBinaria = new BuscaBinaria();
        int[] arr = {1,3,2,5,6};
        System.out.println(buscaBinaria.searchBinary(arr, 1));
    }
}
