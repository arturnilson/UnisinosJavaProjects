package LabII.TrabalhoFinal_ControleEstoque.main;

/*
 *  Artur Nilson
 *  Jean Lukas Andrade Restelli 
 */

import LabII.TrabalhoFinal_ControleEstoque.estruturas.Produto;
import LabII.TrabalhoFinal_ControleEstoque.gerenciador.ControleEstoque;
import LabII.TrabalhoFinal_ControleEstoque.ui.MenuUI;

public class Main {
    public static void main(String[] args) {
        MenuUI menu = new MenuUI();

        menu.menu();
    }
}
