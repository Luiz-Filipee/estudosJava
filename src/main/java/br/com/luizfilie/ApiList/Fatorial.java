package br.com.luizfilie.ApiList;

public class Fatorial {
    public int fatorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        System.out.println(fatorial.fatorial(5));
    }
}
