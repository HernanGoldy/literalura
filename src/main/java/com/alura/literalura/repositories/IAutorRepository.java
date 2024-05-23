package com.alura.literalura.repositories;

import com.alura.literalura.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombreContainingIgnoreCase(String nombreAutor);
}
