package efzo.com.usermanagementservice.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * This is a Custom exception for when a requested resource is not found.
 * Mapped to Http 404 Not Found by @ResponseStatus (or handled globally)
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
