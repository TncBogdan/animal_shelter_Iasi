package com.tnc.service.exceptions;

public class ValidationException extends RuntimeException{
    private ApiError apiError;

    public ValidationException(String message, ApiError apiError) {

        this.apiError = apiError;
    }

    public ApiError getApiError() {
        return apiError;
    }

    public ValidationException setApiError(ApiError apiError) {
        this.apiError = apiError;
        return this;
    }
}
