package com.user.exception;


/**
 * ValidationException
 * Custom exception for validation errors.
 * @author Developer
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ValidationException extends Exception {

    /**
     * Constructs the exception with a detail message.
     * @param message Detailed error message
     */
    public ValidationException(String message) {
        super(message);
    }
}