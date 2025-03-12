public class Main {
    public static void main(String[] args) {
        Produto[] prods = new Produto[3];
        Estoque e1 = new Estoque();

        prods[0] = new Produto(455,"Microondas",765.5);
        prods[1] = new Produto(555, "Geladeira", 1001.5);
        prods[2] = new Produto(766, "Celular", 905.5);

        e1.adicionarProduto(prods[0]);
        e1.adicionarProduto(prods[1]);
        e1.adicionarProduto(prods[2]);

        e1.buscarProduto("Celular");
    }
}
