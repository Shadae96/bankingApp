package services;

import com.example.dao.UserDao;
import com.example.dao.UserDaoJavaImpl;

import com.example.models.User;
import com.example.models.Employee;
import com.example.models.Customer;

import com.example.store.Store;



public class UserService {
    
    UserDao userDao = new UserDaoJavaImpl();

    public boolean validateCredentials (User credentials) {
        User userFromStore = UserDao.getUserByUsername(credentials.getUsername());

        if (userFromStore == null) {
            return false;

        }    
          
        if (userFromStore.getpassword().equals(credentials.getPassword())) {
            return true;
            
        }

        return false;

        }

        public User getUserGivenUsername(String username) {
            return userDao.getUserByUsername(username);
            
        }

        public User createUser(User userToCreate){
            User userFromDB = userDao.getUserByUsername(userToCreate.getUserByUsername());

            if (userFromDB ==null) {
                userDao.createUser(usertoCreate);
                return userToCreate;
                
            }

            return null;
        }




    } 

