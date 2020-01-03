package src.main.java.service;

import src.main.java.model.User;

public class UserServiceImpl implements service.UserService {
    @Override
    public boolean login(String username, String password) {
        checkUserInDatabase(user)
        return false;
    }

    public boolean registration(String nick, String password, String email, ){
        User newUser = new User();
        newUser.setPassword();
        newUser.setName();


        saveToDatabase(newUser);
        return true;
    }
}
