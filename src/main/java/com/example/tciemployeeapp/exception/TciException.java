package com.example.tciemployeeapp.exception;

/**
 * TciException
 *
 * @author Manish Singh
 * @email manissinsh@gmail.com
 * @project TciEmployeeApp
 * @Date 01-06-2023
 * @Description
 **/
public final class TciException extends Exception {

    private static final long serialVersionUID = -1245889253635027058L;

    public TciException(String message) {
        super(message);
    }
}
