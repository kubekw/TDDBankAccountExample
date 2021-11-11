package exceptions;

public class BankAccountActionInvalidException extends RuntimeException{

    public BankAccountActionInvalidException(String message) {
        super(message);
    }
}
