package cenario1;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public class GeraPedido {
    private String cliente;
    private BigDecimal ValorOrcamento;
    private int qtdItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidade) {
        this.cliente = cliente;
        ValorOrcamento = valorOrcamento;
        this.qtdItens = quantidade;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public BigDecimal getValorOrcamento() {
        return ValorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        ValorOrcamento = valorOrcamento;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }
}
