package com.aula2.loja.controller;

import com.aula2.loja.model.Usuario;
import com.aula2.loja.service.UsuarioService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/usuarios")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public Usuario findByNome(@RequestParam String nome) { //localhost:8080/usuarios?kennedy
        Usuario usuario = service.findByNome(nome);
        return usuario;
    }

    @GetMapping("/list")
    public List<Usuario> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        usuario = service.create(usuario);
        return usuario;

    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuario) {
        return service.update(usuario);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id) {
        service.delete(id);
    }
}

