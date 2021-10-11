package cenario1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cenario1.acao.IAcaoPosVenda;

public class GeraPedidoHandler {
    List<IAcaoPosVenda> acoes;

    public GeraPedidoHandler(List<IAcaoPosVenda> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), new Date(), orcamento);

        acoes.forEach(a -> a.executaAcao(pedido));
    }
}
