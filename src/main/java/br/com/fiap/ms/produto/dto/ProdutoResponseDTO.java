package br.com.fiap.ms.produto.dto;

import br.com.fiap.ms.produto.entitie.Produto;

import java.util.List;

public class ProdutoResponseDTO {

    private long id;
    private String nome;
    private String descricao;
    private Double valor;

    public ProdutoResponseDTO(long id, String nome, String descricao, Double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public static List<ProdutoResponseDTO> createMock() {
        return List.of(
                new ProdutoResponseDTO(1L, "Smart TV", "Smart Tv LG LED 50 Polegadas", 2285.0),
                new ProdutoResponseDTO(2L, "Mouse", "Mouse sem fio", 250.0),
                new ProdutoResponseDTO(3L, "Teclado", "Teclado sem fio", 278.95)
        );
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
