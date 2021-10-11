package cenario1.acao;

import cenario1.Pedido;

public class SalvaNoBanco implements IAcaoPosVenda {
    public void executaAcao(Pedido pedido) {
        System.out.println("Salvando no banco de dados");
    }
}
