package br.com.luizfilie.ApiList;

class Palindromo {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int original = x;
        int invertido = 0;

        while(x != 0){
            int digito = x % 10;
            invertido = invertido * 10 + digito;
            x /= 10;
        }

        return original == invertido;
    }

    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();
        Boolean condition = palindromo.isPalindrome(10);
        System.out.println(condition);
    }
}

