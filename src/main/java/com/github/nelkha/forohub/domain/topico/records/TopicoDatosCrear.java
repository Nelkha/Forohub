package com.github.nelkha.forohub.domain.topico.records;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record TopicoDatosCrear(

    @NotBlank(message = "El título no puede estar vacío")
    @Size(max = 100, message = "El título debe tener entre 1 y 100 caracteres")
    String titulo,

    @NotBlank(message = "El mensaje no puede estar vacío")
    @Size(max = 500, message = "El mensaje debe tener entre 1 y 500 caracteres")
    String mensaje,

    @NotNull(message = "El autor no puede estar vacío")
    @Positive(message = "El autor debe ser un número entro positivo")
    Long autor,

    @NotNull(message = "El curso no puede estar vacío")
    @Positive(message = "El curso debe ser un número entro positivo")
    Long curso

) {
}
