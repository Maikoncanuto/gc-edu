package br.com.mk.gc.repository;

import br.com.mk.gc.model.DadoBancario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadoBancarioRepository extends JpaRepository<DadoBancario, Long> {
}
