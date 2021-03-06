package LabII.TrabalhoFinal_ControleEstoque.gerenciador;

/*
 *  Artur Nilson
 *  Jean Lukas Andrade Restelli 
 */

import java.util.ArrayList;
import java.util.List;

import LabII.TrabalhoFinal_ControleEstoque.estruturas.Produto;
import LabII.TrabalhoFinal_ControleEstoque.exceptions.ProductAlreadyExists;
import LabII.TrabalhoFinal_ControleEstoque.exceptions.ProductNotFoundException;

public class ControleEstoque {
    private List<Produto> listProdutos;

    public ControleEstoque() {
        listProdutos = new ArrayList<>();
    }

    public void insereProduto(Produto prod) {
        Produto produto = this.getProdutoByCodigo(prod.getCodigo());

        if (produto instanceof Produto) {
            throw new ProductAlreadyExists("Código já cadastrado em outro produto.");
        }

        listProdutos.add(prod);
    }

    public int entradaEstoque(int codigo, int entrada) {
        Produto produto = this.getProdutoByCodigo(codigo);
        this.produtoExiste(produto);

        produto.aumentaQuantidade(entrada);
        return produto.getQuantidade();
    }

    public int saidaEstoque(int codigo, int saida) {
        Produto produto = this.getProdutoByCodigo(codigo);
        this.produtoExiste(produto);

        produto.diminuiQuantidade(saida);
        return produto.getQuantidade();
    }

    private void produtoExiste(Produto prod) {
        if (prod == null) {
            throw new ProductNotFoundException("Produto não encontrado");
        }
    }

    private Produto getProdutoByCodigo(int codigo) {
        Object[] produtos = this.listarProdutos();

        for (int indx = 0; indx < produtos.length; indx++) {
            Produto produto = (Produto) produtos[indx];
            if (codigo == produto.getCodigo()) {
                return produto;
            }
        }
        return null;
    }

    public Object[] listarProdutos() {
        return listProdutos.toArray();
    }

    public Object[] listarProdutosAbaixoEstoque() {
        List<Produto> produtosAbaixoEstoque = new ArrayList<>();
        Object[] produtos = this.listarProdutos();

        for (int indx = 0; indx < produtos.length; indx++) {
            Produto produto = (Produto) produtos[indx];
            if (produto.getQuantidade() < produto.getQuantidadeMinEstoque()) {
                produtosAbaixoEstoque.add(produto);
            }
        }

        if (produtosAbaixoEstoque.isEmpty()) {
            return null;
        }

        return produtosAbaixoEstoque.toArray();
    }

}
