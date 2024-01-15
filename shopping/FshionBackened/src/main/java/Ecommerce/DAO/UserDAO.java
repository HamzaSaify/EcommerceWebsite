package Ecommerce.DAO;

import Ecommerce.model.UserDetail;

public interface UserDAO {
	public boolean resgisterUser(UserDetail user);

	public boolean updateUser(UserDetail user);

	public UserDetail getUser(String userName);
}
