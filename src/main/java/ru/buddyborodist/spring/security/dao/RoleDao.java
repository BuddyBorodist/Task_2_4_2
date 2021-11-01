package ru.buddyborodist.spring.security.dao;

import ru.buddyborodist.spring.security.model.Role;

import java.util.List;

public interface RoleDao {

    List<Role> getAllRoles();

    void saveRole (Role role);

    void deleteRoleId(Long id);

    void updateRole(Role role);

    Role getRoleName (String name);
}
