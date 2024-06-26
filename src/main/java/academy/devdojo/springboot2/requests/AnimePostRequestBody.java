package academy.devdojo.springboot2.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBody {
    // Atributo não pode ser null e nem vazio
    @NotEmpty(message = "The anime name cannot be empty")
    private String name;
}
