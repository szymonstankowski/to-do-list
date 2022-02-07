package pl.szymonstankowski.todolist;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ToDoService {

    private static List<ToDo> toDoList = new ArrayList<>();
    private Long id = 2L;

    public static final String IN_PROGRESS = "inProgress";
    public static final String COMPLETED = "completed";

    static {
        toDoList.add(new ToDo(1L, "learn Haskell", IN_PROGRESS));
        toDoList.add(new ToDo(2L, "start running", COMPLETED));
    }


    public List<ToDo> toDoList() {
        return toDoList;
    }

    public ToDo getToDoById(Long id) {
        ToDo taskById = toDoList.stream()
                .filter(toDo -> toDo.getId().equals(id))
                .findFirst().get();

        return taskById;
    }

    public void addToDo(ToDo task) {
        id++;
        toDoList.add(new ToDo(id, task.getText(), task.getStatus()));
    }

    public void deleteToDo(Long id) {
        toDoList.removeIf(task -> task.getId().equals(id));
    }

    public void updateToDo(Long id, ToDo task) {
        deleteToDo(id);
        toDoList.add(new ToDo(id, task.getText(), task.getStatus()));
    }

}
