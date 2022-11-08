package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Funcionario;
import org.soulcodeacademy.helpr.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    //Listar todos
    public List<Funcionario> listar() {
        // Retorna os dados da tabela em forma de lista
        // SELECT * FROM cargo;
        return this.funcionarioRepository.findAll();
    }

    //Listar somente um funcionario pelo ID
    public Funcionario getFuncionario(Integer id) {
        Optional<Funcionario> funcionario = this.funcionarioRepository.findById(id);
        return funcionario.get();
    }
}
