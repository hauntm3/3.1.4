package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.entities.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    Role save(Role role);

    List<Role> findAll();

    Optional<Role> findById(Long id);

    void deleteById(Long id);

    Optional<Role> findByName(String name);
}
