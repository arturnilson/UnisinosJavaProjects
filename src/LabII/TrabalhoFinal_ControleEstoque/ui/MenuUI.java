package LabII.TrabalhoFinal_ControleEstoque.ui;

import java.util.Scanner;

import LabII.TrabalhoFinal_ControleEstoque.estruturas.Produto;
import LabII.TrabalhoFinal_ControleEstoque.gerenciador.ControleEstoque;

public class MenuUI {
    private Scanner teclado;
    private ControleEstoque controleEstoque;

    public MenuUI() {
        teclado = new Scanner(System.in);
        controleEstoque = new ControleEstoque();
    }

    public void menu() {
        boolean continuar = true;

        do {
            System.out.println(this.getMenu());
            System.out.println("Digite a opção desejada: ");

            if (teclado.hasNextInt()) {
                int t = teclado.nextInt();

                if (t <= 5) {
                    this.escolherOpcao(t);
                } else {
                    continuar = false;
                }
            } else {
                System.out.println("Caracter inválido. Digite um inteiro de 1-6!");
                continuar = false;
            }

        } while (continuar);

    }

    public void escolherOpcao(int opcao) {
        switch (opcao) {
            case 1:
                Scanner teclado1 = new Scanner(System.in);
                System.out.println("---=== Inserir Produto ===---");

                try {
                    System.out.println("Informe o Código: ");
                    int codProduto = teclado1.nextInt();

                    teclado1.nextLine();
                    System.out.println("Informe a Descrição: ");
                    String nome = teclado1.nextLine();

                    System.out.println("Informe o Estoque Inicial: ");
                    int qtdEstoque = teclado1.nextInt();

                    System.out.println("Informe a Quantidade Mínima: ");
                    int qtdMinima = teclado1.nextInt();

                    controleEstoque.insereProduto(new Produto(codProduto, nome, qtdEstoque, qtdMinima));
                    System.out.println("Produto adicionado com sucesso!");
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 2:
                Scanner teclado2 = new Scanner(System.in);
                System.out.println("---=== Adicionar Quantidade no Estoque ===---");

                try {
                    System.out.println("Informe o Código do Produto: ");
                    int codigo = teclado2.nextInt();
                    System.out.println("Informe a Quantidade: ");
                    int entrada = teclado2.nextInt();

                    int estoqueAtual = controleEstoque.entradaEstoque(codigo, entrada);
                    System.out.println("Estoque do produto atualizado para " + estoqueAtual);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 3:
                Scanner teclado3 = new Scanner(System.in);
                System.out.println("---=== Retirar Quantidade do Estoque ===---");

                try {
                    System.out.println("Informe o Código do Produto: ");
                    int codigo = teclado3.nextInt();
                    System.out.println("Informe a Quantidade: ");
                    int saida = teclado3.nextInt();

                    int estoqueAtual = controleEstoque.saidaEstoque(codigo, saida);
                    System.out.println("Estoque do produto atualizado para " + estoqueAtual);
                } catch (Exception e) {
                    System.out.println(e.toString());
                }

                break;

            case 4:
                System.out.println("---=== Listagem de Produtos ===---");

                Object[] produtos = controleEstoque.listarProdutos();

                if (produtos.length == 0) {
                    System.out.println("Lista Vazia.");
                    break;
                }

                for (int indx = 0; indx < produtos.length; indx++) {
                    Produto produto = (Produto) produtos[indx];

                    System.out.println("<< Produto " + produto.getCodigo() + " - " + produto.getDescricao() + " >>");
                    System.out.println("Estoque Atual: " + produto.getQuantidade());
                    System.out.println("Estoque Mínimo: " + produto.getQuantidadeMinEstoque() + "\n");
                }

                break;

            case 5:
                System.out.println("---=== Listagem de Produtos Abaixo do Estoque ===---");
                Object[] produtosAbaixo = controleEstoque.listarProdutosAbaixoEstoque();

                if (produtosAbaixo == null) {
                    System.out.println("Nenhum produto abaixo do estoque.");
                    break;
                }

                for (int indx = 0; indx < produtosAbaixo.length; indx++) {
                    Produto produto = (Produto) produtosAbaixo[indx];

                    System.out.println("<< Produto " + produto.getCodigo() + " - " + produto.getDescricao() + " >>");
                    System.out.println("Estoque Atual: " + produto.getQuantidade());
                    System.out.println("Estoque Mínimo: " + produto.getQuantidadeMinEstoque() + "\n");
                }

                break;
        }
    }

    public String getMenu() {
        return "----==== MENU CONTROLE DE ESTOQUE ====----" + "\n1- Inserir Produto"
                + "\n2- Adicionar Quantidade Estoque" + "\n3- Retirar Quantidade do Estoque" + "\n4- Listar Produtos"
                + "\n5- Listar Produtos Abaixo do Estoque" + "\n6- Sair\n\n";
    }
}
