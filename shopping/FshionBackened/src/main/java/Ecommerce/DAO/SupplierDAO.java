package Ecommerce.DAO;

import java.util.List;

import Ecommerce.model.Product;
import Ecommerce.model.Supplier;

public interface SupplierDAO {
	public boolean addSupplier (Supplier supplier);
	public boolean deleteSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
	public List<Supplier> listSupplier();
	public Supplier getSupplier(int supplierId);
}
