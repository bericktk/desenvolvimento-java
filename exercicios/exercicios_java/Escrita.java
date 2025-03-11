package exercicios_java;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Escrita {
    public static void main(String[] args){

        String arquivoData = "C:\\Users\\breri\\Documents\\StudyJava\\Java\\desenvolvimento-java\\exercicios\\exercicios_java\\data.txt";

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Insira a opção desejada");
            String opcao = scan.nextLine();

            if(opcao.equals("1")){
                try(PrintWriter pw = new PrintWriter(new FileWriter(arquivoData))){
                    System.out.println("Insira a tarefa");
                    String tasks = scan.nextLine();
                    pw.println(tasks);
                    System.out.println("Tarefa Adicionada com Sucesso");
                }catch(IOException e){
                    System.out.println("Erro ao escrever o arquivo");
                    e.printStackTrace();
                }
            }else if(opcao.equals("2")){
                try (BufferedReader br = new BufferedReader(new FileReader(arquivoData))) {
                    String linha;
                    while ((linha = br.readLine()) != null) {
                        System.out.println(linha);
                    }
                } catch (IOException e) {
                    System.err.println("Erro ao ler o arquivo: " + e.getMessage());
                }
            }else{
                break;
            }
        }
        System.out.println("Programa finalizado");
        scan.close();
    }
}
