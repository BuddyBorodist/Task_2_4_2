package ru.buddyborodist.spring.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.buddyborodist.spring.security.dao.RoleDao;
import ru.buddyborodist.spring.security.model.Role;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    @Override
    public void saveRole(Role role) { roleDao.saveRole(role); }

    @Override
    public void deleteRoleId(Long id) {
        roleDao.deleteRoleId(id);
    }

    @Override
    public void updateRole(Role role) { roleDao.updateRole(role); }

    @Override
    public Role getRoleName(String name) {
        return roleDao.getRoleName(name);
    }
}
