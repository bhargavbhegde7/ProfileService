package com.prof.exception;

public class DataAccessException extends Exception {

    //todo : learn about serialVersionUID
    //private static final long serialVersionUID = 1997753363232807009L;

    public DataAccessException(){

    }

    public DataAccessException(String message){
        super(message);
    }

    public DataAccessException(Throwable cause)
    {
        super(cause);
    }

    public DataAccessException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public DataAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
