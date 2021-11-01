package ru.buddyborodist.spring.security.service;

import ru.buddyborodist.spring.security.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    void saveRole (Role Role);

    void deleteRoleId(Long id);

    void updateRole (Role role);

    Role getRoleName(String name);
}
