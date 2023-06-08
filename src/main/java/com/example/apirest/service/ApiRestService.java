package com.example.apirest.service;

import com.example.apirest.entity.Tarefa;
import com.example.apirest.repository.ApiRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiRestService {
    @Autowired
    ApiRestRepository apiRestRepository;
    public Tarefa novaTarefa(Tarefa novaTarefa){
        apiRestRepository.novaTarefa(novaTarefa);
        return novaTarefa;
    }

    public List<Tarefa> listaDeTarefas(){
        return apiRestRepository.listaDeTarefas();
    }

    public Tarefa buscarTarefaPorId(int id){
        return apiRestRepository.buscarTarefaPorId(id);
    }

    public Tarefa AtualizarTarefa(int id, Tarefa tarefaAtualizada){
        Tarefa tarefaDesatualizada = buscarTarefaPorId(id);
        if (tarefaDesatualizada == null){
            return null;
        }else{
            tarefaAtualizada.setId(tarefaDesatualizada.getId());
            apiRestRepository.deletarTarefa(tarefaDesatualizada);
            return apiRestRepository.novaTarefa(tarefaAtualizada);
        }
    }
}
