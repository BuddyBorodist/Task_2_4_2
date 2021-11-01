package ru.buddyborodist.spring.security.dao;

import org.springframework.stereotype.Repository;
import ru.buddyborodist.spring.security.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("select u from Role u", Role.class).getResultList();
    }

    @Override
    public void saveRole(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void deleteRoleId(Long id) {
        entityManager.remove(entityManager.find(Role.class, id));
    }

    @Override
    public void updateRole(Role role) {
        entityManager.merge(role);
    }

    @Override
    public Role getRoleName(String name) {
        TypedQuery<Role> queryRole = entityManager.createQuery("select r from Role r where r.name=:role",
                Role.class).setParameter("role", name);
        return queryRole.getSingleResult();
    }
}