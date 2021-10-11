package cenario1;

import cenario1.acao.EnviarEmail;
import cenario1.acao.SalvaNoBanco;

import java.math.BigDecimal;
import java.util.Arrays;

public class PedidoTest {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int qtdItens = Integer.parseInt(args[2]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, qtdItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
                new EnviarEmail(),
                new SalvaNoBanco()));

        handler.executa(geraPedido);


    }
}
