package Atividade2;

public class Quest4_ECommerce {

    public static void main(String[] args) {

        Quest4_Produto_Ecommerce prod1 = new Quest4_Produto_Ecommerce("Feijão preto", 10, 50.00);

        System.out.println("Produto: " + prod1.getNomeProduto());
        System.out.println("Preco: " + prod1.getPrecoProduto());

        prod1.ComprarProduto(1);

        System.out.println("Quantidade em estoque: " + prod1.getQuantidadeProduto());

        prod1.ComprarProduto(1);

        System.out.println("Quantidade em estoque: " + prod1.getQuantidadeProduto());

        prod1.ComprarProduto(9);

        System.out.println("Quantidade em estoque: " + prod1.getQuantidadeProduto());
    }
}
