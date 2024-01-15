package ECommerce.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Ecommerce.DAO.ProductDAO;
import Ecommerce.model.Product;

public class ProductJunitTest {

	static ProductDAO productDAO;
	@BeforeClass
	public static void executeFirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("ECommerce");
		context.refresh();
		productDAO=(ProductDAO)context.getBean("productDAO");

}
	@Test
	public void addProductTest() {
		Product product =new Product();
		product.setProductName("Tshirt");
		product.setProductDesc("United Colors Of Benetton");
		product.setPrice(800);
		product.setStock(45);
		product.setCategoryId(18);
		product.setSupplierId(15);
		assertTrue("Problem in adding the product",productDAO.addProduct(product));
		
	}
	
}