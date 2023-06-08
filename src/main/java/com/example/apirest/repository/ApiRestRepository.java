package com.example.apirest.repository;

import com.example.apirest.entity.Tarefa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ApiRestRepository {
    List<Tarefa> tarefas = new ArrayList<>();

    public List<Tarefa> listaDeTarefas(){
        return tarefas;
    }

    public Tarefa novaTarefa(Tarefa novaTarefa){
        tarefas.add(novaTarefa);
        return novaTarefa;
    }

    public Tarefa buscarTarefaPorId(int id){
        return tarefas.stream()
                .filter(tarefa -> tarefa.getId() == id)
                .findFirst().get();
    }

    public Tarefa deletarTarefa(Tarefa tarefa){
        tarefas.remove(tarefa);
        return tarefa;
    }
}
