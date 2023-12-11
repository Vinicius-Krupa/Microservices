package io.github.ViniciusKrupa.mscartoes.application.representation;

import io.github.ViniciusKrupa.mscartoes.domain.BandeiraCartao;
import io.github.ViniciusKrupa.mscartoes.domain.Cartao;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoSaveRequest {

    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limite;

    public Cartao toModel() {
        return new Cartao(nome, bandeira, renda, limite);
    }
}
