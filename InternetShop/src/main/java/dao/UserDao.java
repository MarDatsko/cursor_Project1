package src.main.java.dao;

import src.main.java.model.User;

/**
 * Created by Igor on 10/8/2019.
 */
public interface UserDao {
    void setUserIntoDatabase(User user);
    User getUserFromDatabase();
    void checkUserInDatabase(User user);
}
