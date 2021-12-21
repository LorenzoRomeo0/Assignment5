package dao;

import java.util.ArrayList;

public interface UserDAO {
	UserDTO getUser(String username);
	ArrayList<UserDTO> getAllUsers();
	
}
