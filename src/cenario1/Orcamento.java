package cenario1;

import java.math.BigDecimal;

public class Orcamento {
    BigDecimal valor;
    int qtdItens;

    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdItens() {
        return qtdItens;
    }
}
