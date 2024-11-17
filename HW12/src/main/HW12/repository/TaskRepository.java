package main.HW12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.HW12.model.Task;
import main.HW12.model.TaskStatus;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Получить список задач по их статусу
     * @param status
     * @return
     */
    List<Task> findByStatus(TaskStatus status);
}