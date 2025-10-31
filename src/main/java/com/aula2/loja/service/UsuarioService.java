package com.aula2.loja.service;

import com.aula2.loja.model.Usuario;
import com.aula2.loja.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private Usuario usuario;

    @Autowired
    private UsuarioRepository repository;

    public Usuario findByNome(String nome) {
        return repository.findByNome(nome);
    }

    public Usuario create(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> findAll() {
        return  repository.findAll();
    }

    public Usuario update(Usuario usuario) {
        return repository.save(usuario);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
