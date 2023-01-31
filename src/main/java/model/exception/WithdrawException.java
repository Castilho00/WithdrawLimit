package model.exception;

public class WithdrawException extends Exception {
    private static final long serialVersiunUID = 1L;

    public WithdrawException(String msg){
        super(msg);
    }
}
