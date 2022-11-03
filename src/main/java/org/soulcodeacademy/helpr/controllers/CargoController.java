package org.soulcodeacademy.helpr.controllers;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Retornos de dados
public class CargoController {

    //Endpoint é o endereço que será acessado no backend
    @GetMapping("/oi") //com base em localhosto8080/oi retorna a String
    public String dizOla(){
        return "Olá Mundo!";
    }

    @GetMapping("/batata")
    public Integer valor() {
        return 1000; //resposta da requisição
    }

    @Autowired
    private CargoService cargoService;

    @GetMapping("/cargos")
    public List<Cargo> listar() {
        return this.cargoService.listar();  // formato JSON = JAVASCRIPT OBJECT NOTATION
    }

    @GetMapping("/cargos/{idCargo}") // indica q o valor após a barra é dinâmico!
    public Cargo getCargo(@PathVariable Integer idCargo) {
        // @PathVariable  => extrai do endpoint o valor dinâmico
        return this.cargoService.getCargo(idCargo);
    }

    // Podemos usar o mesmo endpoint para verbos diferentes
    @PostMapping("/cargos") // REQUISIÇÃO TIPO POST para /cargos
    public Cargo salvar(@RequestBody Cargo cargo) {
        // @RequestBody - extrair o JSON do corpo e converte para Cargo (deserialização)
        Cargo salvo = this.cargoService.salvar(cargo);
        return salvo; // A resposta será o cargo inserido
    }
}