package br.com.lukedevfull.personalExeptions;

public class InvalidNumericException extends RuntimeException {
    public InvalidNumericException(String message) {
        super(message);
    }
}
