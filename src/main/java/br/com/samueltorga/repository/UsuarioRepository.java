package br.com.samueltorga.repository;

import br.com.samueltorga.repository.entity.Usuario;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
