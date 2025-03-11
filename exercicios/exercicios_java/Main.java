package exercicios_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            TaskList taskList = new TaskList();
            while (true){
                System.out.println("Insira a opção desejada");
                String opcao = sc.nextLine();

                if(opcao .equals("1")){
                    System.out.println("Insira a tarefa");
                    String tasks = sc.nextLine();
                    taskList.addTask(tasks);
                    System.out.println("Tarefa Adicionada com Sucesso");

                }else if(opcao .equals("2")){
                    taskList.listTasks();
                }else{
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao executar o programa");
            e.printStackTrace();
        }finally{
            System.out.println("Programa finalizado");
            sc.close();
        }
        
    }
}