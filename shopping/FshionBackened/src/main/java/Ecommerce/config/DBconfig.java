package Ecommerce.config;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Ecommerce.model.CartItem;
import Ecommerce.model.Category;
import Ecommerce.model.OrderDetail;
import Ecommerce.model.Product;
import Ecommerce.model.Supplier;
import Ecommerce.model.UserDetail;

@Configuration
@EnableTransactionManagement
@ComponentScan("eCommerce")
public class DBconfig {
@Bean(name="dataSource")
public DataSource getH2DataSource() {

	DriverManagerDataSource dataSource =new DriverManagerDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("");
	dataSource.setUsername("");
	dataSource.setPassword("");
	System.out.println("datasource object is created");
	return dataSource;
}
@Bean(name="sessionFactory")
public SessionFactory getSessionFactory() {
	Properties hibernatProp=new Properties();
	hibernatProp.put(" hibernate.hdm2ddl.auto","update");
	hibernatProp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	//LocalSessionFactoryBuilder localFactory=new LocalSessionFactoryBuilder(getH2DataSource());
	LocalSessionFactoryBuilder localFactory=new LocalSessionFactoryBuilder(getH2DataSource());
	localFactory.addProperties(hibernatProp);
	
	localFactory.addAnnotatedClass(Category.class);
	
	localFactory.addAnnotatedClass(Product.class);
	localFactory.addAnnotatedClass(Supplier.class);
	localFactory.addAnnotatedClass(UserDetail.class);

	localFactory.addAnnotatedClass(UserDetail.class);
	localFactory.addAnnotatedClass(CartItem.class);

	localFactory.addAnnotatedClass(OrderDetail.class);
	System.out.println("sesion factory");
	return localFactory.buildSessionFactory();
	
}

@Bean(name="txManager")
public  HibernateTransactionManager getTransactionManger(SessionFactory sessionFactory)
{
	System.out.println("------Transaction Manage Object Created---");
	
	return new HibernateTransactionManager(sessionFactory);
	
}

}
