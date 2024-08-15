package clean.arch.todo.task.data.models;

import clean.arch.todo.task.domain.entities.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name="tasks")
@AllArgsConstructor
@Getter
@Setter
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private boolean done;

    public TaskModel() {
    }

    public Task toTask(TaskModel taskModel) {
        Task task = new Task();
        task.setId(taskModel.getId());
        task.setName(taskModel.getName());
        task.setDone(taskModel.isDone());
        return task;
    }

    public TaskModel toTaskModel(Task task) {
        TaskModel taskModel = new TaskModel();
        task.setId(taskModel.getId());
        task.setName(taskModel.getName());
        task.setDone(taskModel.isDone());

        return taskModel;
    }

    public List<Task> toTaskList(List<TaskModel> tasksModel) {
        return tasksModel.stream().map(temp -> {
            Task obj = new Task();
            obj.setId(temp.getId());
            obj.setName(temp.getName());
            obj.setDone(temp.isDone());
            return obj;
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "TaskModel [id=" + id + ", name=" + name + ", done=" + done + "]";
    }
}
