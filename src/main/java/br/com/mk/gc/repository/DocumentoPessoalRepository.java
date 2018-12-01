package br.com.mk.gc.repository;

import br.com.mk.gc.model.DocumentoPessoal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoPessoalRepository extends JpaRepository<DocumentoPessoal, Long> {
}
