package com.aatorganicos.aatorganicos.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aatorganicos.aatorganicos.model.Pessoa;
import com.aatorganicos.aatorganicos.repository.IPessoaRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/pessoa")
@AllArgsConstructor
public class PessoaController {

    private final IPessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> pessoa() {
        return pessoaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {

        return pessoaRepository.save(pessoa);

    }

}
