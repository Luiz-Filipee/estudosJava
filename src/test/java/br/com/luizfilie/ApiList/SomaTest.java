package br.com.luizfilie.ApiList;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomaTest {

    @Test
    public void soma() {
        Soma soma = new Soma();
        int result = soma.soma(10,20);
        assertEquals(30, result);
    }
}