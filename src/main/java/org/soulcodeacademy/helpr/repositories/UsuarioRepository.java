package org.soulcodeacademy.helpr.repositories;

import org.soulcodeacademy.helpr.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
//class UsuarioRepositoryImpl implements UsuarioRepository
//por baixo dos panos a classe é gerada dessa forma acima

//Metodos presentes
// - findAll => SELECT * FROM usuario;
// - findById => SELECT * FROM usuario WHERE id = ?;
// - save => INSERT INTO(caso id nulo) ou UPDATE (caso id nao nulo)

//CRUD de funcionarios
//Entidade => Repository -> DTO -> Service + Controller