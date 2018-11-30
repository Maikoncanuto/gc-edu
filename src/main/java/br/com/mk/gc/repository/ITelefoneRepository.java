package br.com.mk.gc.repository;

import br.com.mk.gc.model.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITelefoneRepository extends JpaRepository<Telefone, Long> {
}
