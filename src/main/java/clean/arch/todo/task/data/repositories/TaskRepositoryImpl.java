package clean.arch.todo.task.data.repositories;

import clean.arch.todo.task.data.datasources.TaskDatasourcesLocal;
import clean.arch.todo.task.data.models.TaskModel;
import clean.arch.todo.task.domain.entities.Task;
import clean.arch.todo.task.domain.repositories.TaskRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TaskRepositoryImpl implements TaskRepository {
    final TaskDatasourcesLocal taskDatasourcesLocal;

    @Override
    public void upsertTask(Task task) {
        TaskModel taskModel = new TaskModel();
        taskDatasourcesLocal.upsertTask(taskModel.toTaskModel(task));
    }

    @Override
    public void deleteTask(int id) {
        taskDatasourcesLocal.deleteTask(id);
    }

    @Override
    public List<Task> listTasks() {
        TaskModel albumModel = new TaskModel();
        return albumModel.toTaskList(taskDatasourcesLocal.listTasks());
    }
}
