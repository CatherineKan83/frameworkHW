package main.Hw8.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.Hw8.model.Note;

import java.util.Optional;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {

    /**
     * Найти заметку по id
     * @param id must not be {@literal null}.
     * @return возвращает заметку.
     */
    Optional<Note> findById(Long id);
}
