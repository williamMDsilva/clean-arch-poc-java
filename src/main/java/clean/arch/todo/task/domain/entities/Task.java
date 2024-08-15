package clean.arch.todo.task.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Task {
    int id;
    String name;
    boolean done;

    public Task() {

    }
}
