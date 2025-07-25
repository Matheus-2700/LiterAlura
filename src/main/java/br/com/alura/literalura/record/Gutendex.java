package br.com.alura.literalura.record;

import java.util.List;

public record Gutendex(
        int count,
        String next,
        String previous,
        List<DadosLivro> results
) {
}
