package ECommerce.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Ecommerce.DAO.UserDAO;
import Ecommerce.model.UserDetail;

public class UserJunitTest {

	static UserDAO userDAO;
	@BeforeClass
	public static void executeFirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("ECommerce");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userDAO");
	}
	@Test
	public void resgisterUserTest() {
		UserDetail user=new UserDetail();
		user.setUserName("saifi");
		user.setPassword("1234");
		user.setEnable(true);
		user.setRole("ROLE_USER");
		user.setCustomerName("akash");
		user.setCuStomerAddr("Up");
		assertTrue("Problem in Registering user",userDAO.resgisterUser(user));
	}

}
