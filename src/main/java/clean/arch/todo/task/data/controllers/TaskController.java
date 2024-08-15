package clean.arch.todo.task.data.controllers;

import clean.arch.todo.task.data.models.TaskRequestModel;
import clean.arch.todo.task.data.models.TaskResponseModel;
import clean.arch.todo.task.domain.usecases.UpsertTask;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class TaskController {

    final UpsertTask upsertTask;

    @PostMapping(path = "/tasks", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TaskResponseModel> create(@RequestBody TaskRequestModel requestModel) {

        try {
            upsertTask.call(TaskRequestModel.toTask(requestModel));

            return new ResponseEntity<TaskResponseModel>(new TaskResponseModel(HttpStatus.OK.value(), HttpStatus.OK.name()),
                    HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
