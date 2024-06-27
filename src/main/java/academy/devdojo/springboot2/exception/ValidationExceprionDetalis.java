package academy.devdojo.springboot2.exception;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ValidationExceprionDetalis extends ExceptionDetails {
    private String field;
    private String fieldMessage;
}
