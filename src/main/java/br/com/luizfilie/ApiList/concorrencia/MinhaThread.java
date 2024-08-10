package br.com.luizfilie.ApiList.concorrencia;

public class MinhaThread extends Thread {
    @Override
    public void run() {
        System.out.println("Executando em paralelo");
    }
}

class TesteConcorrencia{
    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread();
        thread.start();
    }
}