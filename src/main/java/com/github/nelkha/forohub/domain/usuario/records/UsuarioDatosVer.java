package com.github.nelkha.forohub.domain.usuario.records;

import com.github.nelkha.forohub.domain.perfil.Perfil;
import com.github.nelkha.forohub.domain.usuario.Usuario;

import java.util.List;

public record UsuarioDatosVer(
        Long id,
        String nombre,
        String correoelectronico,
        List<Long> pefiles
) {

    public UsuarioDatosVer(Usuario usuario) {
        this(
            usuario.getId(),
            usuario.getNombre(),
            usuario.getCorreoelectronico(),
            usuario.getPerfiles().stream().map(Perfil::getId).toList()
        );
    }

}
