package clean.arch.todo.task.data.datasources;

import clean.arch.todo.task.data.models.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskModel, String> {
}
