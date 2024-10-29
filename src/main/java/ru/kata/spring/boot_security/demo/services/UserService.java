package ru.kata.spring.boot_security.demo.services;


import ru.kata.spring.boot_security.demo.entities.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();

    User add(User user);

    void update(User updatedUser);

    Optional<User> readUser(Long id);

    void delete(Long id);

    Optional<User> findByEmail(String email);
}
