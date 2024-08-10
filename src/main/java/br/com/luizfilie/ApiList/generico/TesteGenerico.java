package br.com.luizfilie.ApiList.generico;

import java.util.Date;

public class TesteGenerico {
    public static void main(String[] args) {
        Caixa<String> texto = new Caixa<>();
        Caixa<Integer> numero = new Caixa<>();
        Caixa<Date> data = new Caixa<>();
        texto.setConteudo("exemplo");
        numero.setConteudo(10);
        data.setConteudo(new Date());
        System.out.println(texto.getConteudo());
        System.out.println(numero.getConteudo());
        System.out.println(data.getConteudo());
    }
}
