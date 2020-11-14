package tacos.repository.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.model.User;

public interface UserRepositoryJpa extends CrudRepository<User, Long> {
    User findByUsername(String username);
}