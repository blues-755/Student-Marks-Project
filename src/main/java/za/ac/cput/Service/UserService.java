/* UserService.java
    Author: Lunga Tshila (216282934)
    Date: 30 July 2021
 */

package za.ac.cput.Service;
import za.ac.cput.Entity.User;
import za.ac.cput.Repository.UserRepository;
import java.util.Set;

public class UserService implements IUserService{

    private static UserService userService = null;
    private UserRepository userRepository;

    public UserService(){
        this.userRepository=UserRepository.getUserRepository();
    }
    public static UserService getUserService(){
        if(userService==null){
            userService = new UserService();
        }
        return userService;
    }

    @Override
    public User create(User user) {
        return this.userRepository.create(user);
    }

    @Override
    public User read(String s) {
        return this.userRepository.read(s);
    }

    @Override
    public User update(User user) {
        return this.userRepository.update(user);
    }

    @Override
    public boolean delete(String s) {
        return this.userRepository.delete(s);
    }

    @Override
    public Set<User> getAll() {
        return this.userRepository.getAll();
    }
}
