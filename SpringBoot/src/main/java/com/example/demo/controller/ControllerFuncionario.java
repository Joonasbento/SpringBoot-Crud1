package com.example.demo.controller;

import com.example.demo.model.Funcionario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionario")

public class ControllerFuncionario {

    private ControllerFuncionario;

    public ControllerFuncionario(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @PostMapping
    public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario){
        funcionarioRepos
        //return ResponseEntity.status((HttpStatus.CREATED).body(funcionario))
    }
}
