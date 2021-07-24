/* IRepository.java
    CRUD implementation for the User.
    Author: Lunga Tshila (216282934)
    Date: 23 July 2021
 */
package za.ac.cput.Repository;
import za.ac.cput.Entity.User;

import java.util.HashSet;
import java.util.Set;


public class UserRepository implements IUserRepository {

    private static UserRepository userRepository = null;
    private Set<User> userDB = null;

    private UserRepository(){
        userDB = new HashSet<User>();
    }

    public static UserRepository getUserRepository(){
        if(userRepository == null){
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    @Override
    public User create(User user) {
        boolean success = userDB.add(user);
        if (!success){
            return null;
        }
        return user;
    }

    @Override
    public User read(String userID) {
        for (User user : userDB)
            if (user.getUserId().equals(userID)){
                return user;
            }
        return null;
    }

    @Override
    public User update(User user) {
        User user1 = read(user.getUserId());
        if (user1 != null){
            userDB.remove(user1);
            userDB.add(user);
            return user;
        }
        return null;
    }

    @Override
    public boolean delete(String userID) {
        User userToDelete = read(userID);
        if (userToDelete == null){
            return false;
        }
        userDB.remove(userToDelete);
        return true;
    }

    @Override
    public Set<User> getAll() {
        return userDB;
    }
}
