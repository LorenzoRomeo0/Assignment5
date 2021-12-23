package dao;

import java.util.ArrayList;

//import exceptions.UserNotFoundException;

public interface UserDAO {
	UserDTO getUser(String username);
	ArrayList<UserDTO> getAllUsers();
	boolean checkPassword(String username, String password);
}