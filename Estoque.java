import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto: "+ produto +" adicionado!");
    }

    public boolean removerProduto(int codigo){
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == codigo) {
                produtos.remove(i);
                System.out.println("Produto: " + i + " removido com sucesso!");
                return true;
            }
        }
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getCodigo() != codigo) {
                System.out.println("O código não consta na lista de produtos.");
            }
        }
        return false;
    }

    public void mostrarProdutos(){
        for(int i = 0 ; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }
    }

    public void caroBarato(){
        Produto maiorValor = produtos.get(0);
        Produto menorValor = produtos.get(0);
        for(int i = 0 ; i < produtos.size(); i++){
            if(produtos.get(i).getPreco() > maiorValor.getPreco()){
                maiorValor = produtos.get(i);
            }
            else if(produtos.get(i).getPreco() < menorValor.getPreco()){
                menorValor = produtos.get(i);
            }
        }
        System.out.println("O produto mais caro é: " + maiorValor);
        System.out.println("O produto mais barato é: " + menorValor);
    }

    public void buscarProduto(String nome){
        for(int i = 0 ; i < produtos.size(); i++) {
            if(produtos.get(i).getNome().equals(nome)) {
                System.out.println("Nome do produto: " + produtos.get(i).getNome());
                System.out.println("Codigo do produto: " + produtos.get(i).getCodigo());
                System.out.println("Valor do produto: " + produtos.get(i).getPreco());
            }
        }
    }

}
