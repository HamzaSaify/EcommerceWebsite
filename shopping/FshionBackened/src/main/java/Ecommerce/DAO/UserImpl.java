package Ecommerce.DAO;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Ecommerce.model.UserDetail;
@Repository("userDAO")
@Transactional
public class UserImpl implements UserDAO{
	@Autowired
SessionFactory sessionFactory;
	@Override
	public boolean resgisterUser(UserDetail user) {
		try {
			sessionFactory.getCurrentSession().save(user);
		
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateUser(UserDetail user) {
		try {
			sessionFactory.getCurrentSession().update(user);
		
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public UserDetail getUser(String userName) {
		Session session=sessionFactory.openSession();
		UserDetail userDetail=(UserDetail)session.get(UserDetail.class,userName);
	session.close();
		
		
		return userDetail;
	}

}
