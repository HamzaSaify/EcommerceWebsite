package ECommerce.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import Ecommerce.DAO.CategoryDAO;
import Ecommerce.DAO.SupplierDAO;
import Ecommerce.model.Supplier;

public class SupplierJunitTest {

	static SupplierDAO supplierDAO;
	@BeforeClass
	public static void executeFirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("ECommerce");
		context.refresh();
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");	
	}
@Test
public void addSupplierTest() {
	Supplier supplier=new Supplier();
	supplier.setSupplierID(5);
	supplier.setSupplierAddr("delhi");
	supplier.setSupplierName("jhangirabad");
	assertTrue("problem in adding supplier",supplierDAO.addSupplier(supplier));
}
}
