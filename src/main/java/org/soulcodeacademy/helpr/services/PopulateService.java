package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Torna o objeto de PopulateService disponivel para toda a aplicação (global)
@Service // indica para o Spring que esta classe será gerenciada por ele
public class PopulateService {
    @Autowired // Injetar um ojeto direto na classe
    private CargoRepository cargoRepository;

  public void populate() {
      Cargo c1 = new Cargo(null, "Diretor Geral", "Gerencia a empresa", 30000.00);
      Cargo c2 = new Cargo(null, "Diretor de Setor", "Gerencia um setor da empresa", 18000.00);
      Cargo c3 = new Cargo(null, "Técnico geral", "Resolve os chamados urgentes", 12000.00);
        // vamos persistir as entidades = salvar no banco
      this.cargoRepository.save(c1); // Insert INTO
      this.cargoRepository.save(c2);
      this.cargoRepository.save(c3);
  }
}
// O objetivo desta classe é inserir no banco dados ficticios de teste
// IOC = Inversion of Control = Inversão de controle = é ele quem manda nas instancias
// Conteiner = é o local onde o Spring guarda os objetos anotados
// @Service = Indica que a classe é um serviço
// Injeção de dependencias = quando o Spring injeta os objetos na classe



