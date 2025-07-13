package efzo.com.usermanagementservice.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception for when a user tries to register with an email that already exists.
 * Mapped to Http 409 conflict exception
 */


@ResponseStatus(HttpStatus.CONFLICT)
public class DuplicateEmailException  extends RuntimeException {
    public DuplicateEmailException(String message){
        super(message);
    }
}
