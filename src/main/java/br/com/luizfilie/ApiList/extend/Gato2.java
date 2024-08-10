package br.com.luizfilie.ApiList.extend;

public class Gato2 extends Animal2{
    @Override
    public String emitirSom() {
        return "miauuu";
    }

    public static void main(String[] args) {
        Animal2 gato = new Gato2();
        System.out.println(gato.emitirSom());
    }
}
