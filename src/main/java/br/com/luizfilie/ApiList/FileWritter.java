package br.com.luizfilie.ApiList;

import java.io.*;

public class FileWritter {
    public static void main(String[] args) {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("arquivo.txt", true));
            bufferedWriter.write("ola mundo");
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;
            StringBuilder stringBuilder = new StringBuilder();
            if((linha = bufferedReader.readLine()) != null){
               stringBuilder.append(linha).append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
