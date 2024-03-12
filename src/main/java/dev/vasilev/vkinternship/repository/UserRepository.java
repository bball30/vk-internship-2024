package dev.vasilev.vkinternship.repository;

import dev.vasilev.vkinternship.dao.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByName(String username);
}
