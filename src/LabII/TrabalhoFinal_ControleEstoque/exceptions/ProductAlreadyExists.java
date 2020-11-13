package LabII.TrabalhoFinal_ControleEstoque.exceptions;

public class ProductAlreadyExists extends RuntimeException {

    public ProductAlreadyExists(String msg) {
        super(msg);
    }
}
