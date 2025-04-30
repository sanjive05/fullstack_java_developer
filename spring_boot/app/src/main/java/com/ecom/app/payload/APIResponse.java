package com.ecom.app.payload;

public class APIResponse {
    private String message;
    private Boolean status;

    public APIResponse(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

    public APIResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
