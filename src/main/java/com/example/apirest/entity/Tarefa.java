package com.example.apirest.entity;

import com.example.apirest.entity.Enum.Prioridade;
import com.example.apirest.entity.Enum.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tarefa {
    private int id;
    private String titulo;
    private String texto;
    private LocalDateTime dataDeVencimento;
    private Status status;
    private Prioridade prioridade;
    private String responsavel;
    private LocalDateTime dataDeCriacao;
    private LocalDateTime dataDeConclusao;
}
