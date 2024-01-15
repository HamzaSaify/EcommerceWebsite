package Ecommerce.DAO;

import java.util.List;

import Ecommerce.model.CartItem;

public interface CartDAO {
	public boolean addCartItem(CartItem  cartItem);
	public boolean deleteCartItem(CartItem cartItem);
	public boolean updateCartItem(CartItem cartItem);
	public CartItem getCartItem(int cartItemId);
	public List<CartItem> listCartItems(String username);
}
//List<Student> findALL();
//void deletebyId(String theid)
//Student save(Student theid)
//Student findbyid(String the id)