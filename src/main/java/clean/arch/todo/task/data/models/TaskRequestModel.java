package clean.arch.todo.task.data.models;

import clean.arch.todo.task.domain.entities.Task;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TaskRequestModel {
    private int id;
    private String name;
    private boolean done;

    public static Task toTask(TaskRequestModel taskRequest) {
        Task task = new Task();
        task.setId(taskRequest.getId());
        task.setName(taskRequest.getName());
        task.setDone(taskRequest.isDone());
        return task;
    }

    @Override
    public String toString() {
        return "TaskModel [id=" + id + ", name=" + name + ", done=" + done + "]";
    }
}


