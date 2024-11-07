package org.example.ratingservice.exception;

public class ResourceNotFound extends RuntimeException {

    public ResourceNotFound(String s) {
        super(s);
    }

    public ResourceNotFound() {
        super("Resource not found");
    }
}
