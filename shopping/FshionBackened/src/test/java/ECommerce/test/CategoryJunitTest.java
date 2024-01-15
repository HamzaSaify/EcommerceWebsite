package ECommerce.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Ecommerce.DAO.CategoryDAO;
import Ecommerce.model.Category;

public class CategoryJunitTest {

	static CategoryDAO categoryDAO;
	@BeforeClass
	public static void executeFirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("ECommerce");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	
	@Test
	public void addCategoryTest() {
		Category category=new Category();
		category.setCategoryName("T-Shirt with colour");
		category.setCategoryDesc("All Variety of t-shirt");
		assertTrue("Problem in adding the category",categoryDAO.addCategory(category));
				
	}
 
}
