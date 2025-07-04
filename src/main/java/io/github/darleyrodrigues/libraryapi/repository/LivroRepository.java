package io.github.darleyrodrigues.libraryapi.repository;

import io.github.darleyrodrigues.libraryapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
}