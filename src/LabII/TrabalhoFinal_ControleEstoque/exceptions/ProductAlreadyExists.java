package LabII.TrabalhoFinal_ControleEstoque.exceptions;

/*
 *  Artur Nilson
 *  Jean Lukas Andrade Restelli  
 */

public class ProductAlreadyExists extends RuntimeException {

    public ProductAlreadyExists(String msg) {
        super(msg);
    }
}
