package br.com.individual_learn.screenmatch.my_exceptions;

public class ParsingErrorException extends RuntimeException {
    private String message;
    public ParsingErrorException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
