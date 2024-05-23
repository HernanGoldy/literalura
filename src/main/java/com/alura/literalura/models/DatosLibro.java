package com.alura.literalura.models;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DatosLibro(
        @JsonAlias("title") String titulo,
        @JsonAlias("name") Autor autor,
        @JsonAlias("languages") List<String> idioma,
        @JsonAlias("download_count") Double descargas) {
}
