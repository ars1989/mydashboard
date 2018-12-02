package com.mydashboard.dao.impl;

import com.mydashboard.dao.UserDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("userDaoApp")
public class UserDaoImpl extends com.mydashboard.persistence.GenericDao.impl.UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;
}
