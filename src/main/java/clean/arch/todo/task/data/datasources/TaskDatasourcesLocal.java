package clean.arch.todo.task.data.datasources;


import clean.arch.todo.task.data.models.TaskModel;

import java.util.List;

public interface TaskDatasourcesLocal {
    public void upsertTask(TaskModel taskModel);
    public void deleteTask(int id);
    public List<TaskModel> listTasks();
}
