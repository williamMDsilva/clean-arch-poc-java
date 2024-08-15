package clean.arch.todo.task.domain.repositories;
import clean.arch.todo.task.domain.entities.Task;

import java.util.List;

public interface TaskRepository {
    public void upsertTask(Task task);
    public void deleteTask(int id);
    public List<Task> listTasks();
}
