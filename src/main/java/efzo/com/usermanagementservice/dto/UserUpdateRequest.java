package efzo.com.usermanagementservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for updating existing user.
 * Fields can be null if they are optional for update
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateRequest {

    @Email(message = "Email should be valid")
    private String email;

    @Size(min = 3, max = 50, message = "Username must be between 3 to 50 character")
    private String username;

    @Size(min =6, message = "Password must be at least 6 characters long")
    private String password;
}
