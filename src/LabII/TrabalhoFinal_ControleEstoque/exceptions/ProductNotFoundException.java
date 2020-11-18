package LabII.TrabalhoFinal_ControleEstoque.exceptions;

/*
 *  Artur Nilson
 *  Jean Lukas Andrade Restelli  
 */

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String msg) {
        super(msg);
    }
}
