package exercicios_java;

import java.util.ArrayList;
import java.util.List;


public class TaskList {
    List <String> tarefas = new ArrayList<>();

    public void addTask(String task) {
        if (tarefas.contains(task)) {
            throw new IllegalArgumentException("Tarefa já cadastrada");
        } else {
            tarefas.add(task);
        }
    }
    public void removeTask(String task) {
        if(!tarefas.contains(task)) {
            throw new IllegalArgumentException("Tarefa não encontrada");
        }else {
            tarefas.remove(task);
        }
    }

    public void listTasks() {
        for (String task : tarefas) {
            System.out.println(task);
        }
    }

}