package br.com.mk.gc.repository;

import br.com.mk.gc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findUsuarioByUsername(String username);

}
