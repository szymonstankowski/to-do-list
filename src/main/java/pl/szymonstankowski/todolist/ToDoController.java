package pl.szymonstankowski.todolist;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class ToDoController {

    private final ToDoService toDoService;

    @GetMapping("/todo/")
    public String todoList(Model model) {
        model.addAttribute("todolist", toDoService.toDoList());
        return "todo-list";
    }


    @GetMapping("/todo/create/")
    public String create(Model model) {
        model.addAttribute("todo", new ToDo());
        return "todo-form";
    }

    @PostMapping("/todo/create/")
    public String addToDo(@Valid ToDo task, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "todo-form.jsp";
        }
        toDoService.addToDo(task);
        model.addAttribute("todolist", toDoService.toDoList());
        return "redirect:/todo";
    }

    @GetMapping("/todo/update/{id}")
    public String update(Model model, @PathVariable Long id) {
        model.addAttribute("todo", toDoService.getToDoById(id));
        return "todo-update-form";
    }

    @PostMapping("/todo/adjust/{id}")
    public String updateToDo(@Valid ToDo task, @PathVariable Long id, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        toDoService.updateToDo(id, task);
        return "redirect:/todo";
    }

    @GetMapping("/todo/delete/{id}")
    public String deleteToDo(@PathVariable Long id) {
        toDoService.deleteToDo(id);
        return "redirect:/todo";
    }

}
