package com.alura.literalura.repositories;

import com.alura.literalura.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ILibroRepository extends JpaRepository<Libro, Long> {
    Optional<Libro> findByTituloContainingIgnoreCase(String nombreLibro);
}
