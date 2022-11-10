package org.soulcodeacademy.helpr.controllers;

import org.soulcodeacademy.helpr.domain.Cliente;
import org.soulcodeacademy.helpr.domain.dto.ClienteDTO;
import org.soulcodeacademy.helpr.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        return this.clienteService.listar();
    }

    @GetMapping("/clientes/{id}")
    public Cliente getCliente(@PathVariable Integer id) {
        return this.clienteService.getCliente(id);
    }

    @PostMapping("clientes")
    public Cliente salvar(@Valid @RequestBody ClienteDTO dto){
        Cliente cliente = this.clienteService.salvar(dto);
        return cliente;
    }

    @PutMapping("clientes/{id}")
    public Cliente atualizar(@PathVariable Integer id, @Valid @RequestBody ClienteDTO dto){
        Cliente cliente = this.clienteService.atualizar(id, dto);
        return cliente;
    }

    @DeleteMapping("clientes/{id}")
    public void deletar(@PathVariable Integer id){
        this.clienteService.deletar(id);
    }

}
