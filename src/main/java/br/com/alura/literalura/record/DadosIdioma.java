package br.com.alura.literalura.record;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosIdioma(@JsonAlias("languages") String idioma) {
}
