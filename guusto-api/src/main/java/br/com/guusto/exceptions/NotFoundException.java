package br.com.guusto.exceptions;

public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super();
    }

    public NotFoundException(String message) {
        super(message);
    }

}
