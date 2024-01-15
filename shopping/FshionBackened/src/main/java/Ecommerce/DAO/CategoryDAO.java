package Ecommerce.DAO;

import Ecommerce.model.Category;

public interface CategoryDAO {
	public boolean addCategory(Category category);
	public boolean deleteCategory(Category category);
	public boolean updateCategory(Category category);

	public java.util.List<Category> listCategories();
	public Category getCategory(int categoryId);

}
