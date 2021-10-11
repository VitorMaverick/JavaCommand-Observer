package cenario1;

import java.util.Date;


public class Pedido {
    private String cliente;
    private Date data;
    private Orcamento orcamento;

    public Pedido(String cliente, Date data, Orcamento orcamento) {
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

}
