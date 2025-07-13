package efzo.com.usermanagementservice.repository;


import efzo.com.usermanagementservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

    //Spring Data JPA will automatically generate the query based on the method name
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
