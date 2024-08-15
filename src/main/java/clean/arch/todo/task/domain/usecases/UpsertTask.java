package clean.arch.todo.task.domain.usecases;

import clean.arch.todo.task.domain.entities.Task;
import clean.arch.todo.task.domain.repositories.TaskRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpsertTask {
    final TaskRepository taskRepository;

    public void call(Task task) {
        taskRepository.upsertTask(task);
    }
}
