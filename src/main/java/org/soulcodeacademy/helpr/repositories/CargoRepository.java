package org.soulcodeacademy.helpr.repositories;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.springframework.data.repository.CrudRepository;

public interface CargoRepository extends CrudRepository<Cargo, Integer> {

}

// Repository = é um recurso que permite  manipular entidades de um banco de dados
// Add , att, remover e listar (CRUD)
// Indicar na linha 6 qual a entidade var ser gerenciada pelo repository e qual o tipo da PK
// Obs: O Spring gera uma classe dinâmica com base em nossa interface CargoRepository
// CrudRepository: contém as operações básicas de um banco de dados