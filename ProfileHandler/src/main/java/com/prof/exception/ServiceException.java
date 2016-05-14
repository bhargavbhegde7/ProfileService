package com.prof.exception;

public class ServiceException extends Exception{

	//todo : learn about serialVersionUID
	//private static final long serialVersionUID = 1997753363232807009L;

	public ServiceException()
	{
	}

	public ServiceException(String message)
	{
		super(message);
	}

	public ServiceException(Throwable cause)
	{
		super(cause);
	}

	public ServiceException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
