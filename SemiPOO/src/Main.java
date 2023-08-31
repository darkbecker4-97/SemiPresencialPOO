import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Camiseta", 29.99, "Camiseta de algodão");
        Produto produto2 = new Produto("Calça Jeans", 59.99, "Calça jeans clássica");
        Produto produto3 = new Produto("Tênis", 99.99, "Tênis esportivo");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarAoCarrinho(produto1);
        carrinho.adicionarAoCarrinho(produto2);
        carrinho.adicionarAoCarrinho(produto3);

        System.out.println("Produtos no carrinho:");
        for (Produto produto : carrinho.getProdutos()) {
            System.out.println(produto.getNome() + " - " + produto.getValor());
        }

        System.out.println("Valor total: " + carrinho.getTotal());
    }

}


class Produto {
    private String nome;
    private double valor;
    private String descricao;

    public Produto(String nome, double valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}

class CarrinhoDeCompras {
    private List<Produto> produtos;
    private double valorTotal;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
        valorTotal = 0;
    }

    public void adicionarAoCarrinho(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getValor();
    }

    public double getTotal() {
        return valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}