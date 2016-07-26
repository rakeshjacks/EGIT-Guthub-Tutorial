package com.springmvc.dao;

import java.io.Serializable;

import java.util.List;    
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  
import com.springmvc.model.User;

public class UserDAOImpl implements UserDAO {  

	    @Autowired
	    private SessionFactory sessionFactory;
	    @Override
	    public User addUser(User user) {
	        this.sessionFactory.getCurrentSession().save(user);
			return user;
	    }
	   /* @SuppressWarnings("unchecked")
	    @Override
	    public List<User> getAllUser() {
	        return this.sessionFactory.getCurrentSession().createQuery("from User").list();
	    }
	    @Override
	    public void deleteUser(Integer id) {
	        User user = (User) sessionFactory.getCurrentSession().load(
	                User.class, id);
	        if (null != user) {
	            this.sessionFactory.getCurrentSession().delete(user);
	        }
	    }*/
}