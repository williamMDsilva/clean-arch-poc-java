package clean.arch.todo.task.data.datasources.imlp;

import clean.arch.todo.task.data.datasources.JpaTaskRepository;
import clean.arch.todo.task.data.datasources.TaskDatasourcesLocal;
import clean.arch.todo.task.data.models.TaskModel;
import clean.arch.todo.task.domain.entities.Task;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TaskDatasourcesLocalImpl implements TaskDatasourcesLocal {
    final JpaTaskRepository jpaTaskRepository;

    @Override
    public void upsertTask(TaskModel taskModel) {
        jpaTaskRepository.save(taskModel);
    }

    @Override
    public void deleteTask(int id) {
        jpaTaskRepository.deleteById(Integer.toString(id));
    }

    // TODO - paginate and sort by
    @Override
    public List<TaskModel> listTasks() {
        return jpaTaskRepository.findAll();
    }
}
