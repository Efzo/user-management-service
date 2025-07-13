package efzo.com.usermanagementservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;


/**
 * This is a standardise Error response DTO for REST API
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private LocalDateTime timestamp;
    private int status;
    private String error; // Http Error types e.g(bad Request, Not Found)
    private String message; //  A more details user-friendly message
    private String path; //THe request URI that cause error
    private Map<String, String> errors; //For validation errors, a map of field message


    public ErrorResponse(int status, String error, String message, String path) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public ErrorResponse(int status, String error, String message, String path, Map<String, String> errors) {
        this(status, error, message, path);
        this.errors = errors;
    }
}
