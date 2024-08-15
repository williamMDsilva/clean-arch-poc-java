package clean.arch.todo.task.data.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TaskResponseModel {
    int code;

    String message;
}
