package dao;


import com.example.models.User;
import com.example.models.Customer;
import com.example.models.Employee;

import com.example.store.Store;

public class UserDaoJavaImpl {

@override 
public List <User> getAllUsers(){
    return Store.users;
}
    


@Override
 public User getUserByUsername(String username){

    User userFromDb = null;

    for (User user : Store.users){
        if (user == null);
            break;
    }
        if(user.getUsername().equals(username)){
            userFromDb = user;
            break;
        }
 }      
    return userFromDb;

}

@Override   
public void createUser (User user) {
    Store.users.add(user);
}
}

