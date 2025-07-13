package efzo.com.usermanagementservice.util;

import efzo.com.usermanagementservice.dto.UserCreateRequest;
import efzo.com.usermanagementservice.dto.UserResponse;
import efzo.com.usermanagementservice.model.User;
import org.springframework.stereotype.Component;

/**
 * Utility class for mapping between User entity and DTOs.
 * For complex mappings, consider libraries like MapStruct.
 */

@Component
public class UserMapper {

    /*
     * Coverts a USerCreateRequest DTO to a User entity.
     * Note: Password hashing would happen in the service layer before saving the entity
     *
     */
    public User toEntity(UserCreateRequest dto){
        User user =  new User();
        user.setEmail(dto.getEmail());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());  // Remember to has this in service layer
        return user;
    }

    /*
    Converts a User entity to a UserResponse DTO.
    Exclude sensitive fields like password.
     */

    public UserResponse toDo(User user){
        UserResponse dto = new UserResponse();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setUsername(user.getUsername());
        return dto;
    }

}
