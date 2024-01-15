package Ecommerce.DAO;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Ecommerce.model.OrderDetail;

@Repository("orderDAO")
@Transactional
public class OrderDAOimpl implements OrderDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	

	@Override
	public boolean saveOrder(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().save(orderDetail);
			return true;
		}
		catch(Exception e) {
		return false;
		}
	}

	@Override
	public boolean updateCart(String username) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("update CartItem set paymentStatus='p' where username=:uname");
		query.setParameter("uname", username);
		int row_eff=query.executeUpdate();
		if(row_eff>0) {
			return true;
		}
			else {
				return false;
		}
		}
	}


