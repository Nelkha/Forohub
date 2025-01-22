package com.github.nelkha.forohub.domain.usuario.validations;

import com.github.nelkha.forohub.domain.topico.Topico;
import lombok.Getter;
import org.springframework.validation.FieldError;

@Getter
public class UsuarioValidationException extends RuntimeException {

    private final FieldError fieldError;

    public UsuarioValidationException(String field, String message) {
        super(message);
        this.fieldError = new FieldError(Topico.class.getName(),field,message);
    }

}
