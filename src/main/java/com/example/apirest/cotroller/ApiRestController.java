package com.example.apirest.cotroller;

import com.example.apirest.entity.Tarefa;
import com.example.apirest.service.ApiRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apirest/v1")
public class ApiRestController {

    @Autowired
    ApiRestService apiRestService;

    @PostMapping("/tarefa")
    public Tarefa criarNovaTarefa(@RequestBody Tarefa novaTarefa){
        return apiRestService.novaTarefa(novaTarefa);
    }

    @GetMapping("/tarefas")
    public List<Tarefa> listarTarefas(){
        return apiRestService.listaDeTarefas();
    }

    @GetMapping("/tarefa/{id}")
    public Tarefa buscarTarefaPorId(@PathVariable int id){
        return apiRestService.buscarTarefaPorId(id);
    }

    @PutMapping("atualizar/{id}")
    public Tarefa atualizarTarefa(@PathVariable int id, @RequestBody Tarefa tarefaAtualizado){
        return apiRestService.AtualizarTarefa(id, tarefaAtualizado);
    }

}
