package pl.szymonstankowski.todolist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ToDo {


    private Long id;
    @NotBlank(message = "Text is mandatory")
    private String text;
    @NotBlank(message = "Status is mandatory")
    private String status;


}
