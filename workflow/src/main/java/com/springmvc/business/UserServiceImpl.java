package com.springmvc.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;    
import com.springmvc.dao.UserDAO;
import com.springmvc.model.User;

@Service
public class UserServiceImpl implements UserService {  
  
	  /* @Autowired
	    UserDAO userDao;
	   
	   @Autowired
		HibernateTransactionManager transactionManager;
	   
	   @Override
	    public User addUser(User user) {
		   TransactionStatus ts=null;
			TransactionDefinition tdf = new DefaultTransactionDefinition();
			ts=transactionManager.getTransaction(tdf);
			try
			{
	        user=userDao.addUser(user);
	        transactionManager.commit(ts);
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	    }*/
	   /* @Override
	    @Transactional
	    public List<User> getAllUser() {
	        return userDAO.getAllUser();
	    }
	    @Override
	    @Transactional
	    public void deleteUser(Integer id) {
	        userDAO.deleteUser(id);
	    }
	    public void setUserDAO(UserDao userDAO) {
	        this.userDAO = userDAO;
	    }*/
}  