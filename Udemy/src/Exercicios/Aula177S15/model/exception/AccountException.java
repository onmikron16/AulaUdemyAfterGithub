package Exercicios.Aula177S15.model.exception;

import java.io.Serial;

public class AccountException extends Exception{

    @Serial
    private static final long serialVersionUID =1L;

    public AccountException(String msg){
        super(msg);
    }

}
