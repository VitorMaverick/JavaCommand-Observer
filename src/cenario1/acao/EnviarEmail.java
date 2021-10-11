package cenario1.acao;

import cenario1.Pedido;

public class EnviarEmail implements IAcaoPosVenda {
    public void executaAcao(Pedido pedido) {
        System.out.println("Enviando email");
    }
}
