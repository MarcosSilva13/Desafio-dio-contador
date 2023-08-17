package com.desafio;

public class ParametrosInvalidosException extends RuntimeException {
    public ParametrosInvalidosException() {
        super();
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
