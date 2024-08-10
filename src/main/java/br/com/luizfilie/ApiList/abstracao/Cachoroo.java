package br.com.luizfilie.ApiList.abstracao;

public class Cachoroo implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au... Au");
    }

    public static void main(String[] args) {
        Animal animal = new Cachoroo();
        Animal gato = new Gato();
        animal.emitirSom();
        gato.emitirSom();
    }
}
class Gato implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("gatoo");
    }
}