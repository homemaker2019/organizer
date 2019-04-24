package com.homemaker.organizer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.homemaker.organizer.entity.User;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserDAO implements IUserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        String hql = "FROM User as atcl ORDER BY atcl.id";
        return (List<User>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

}