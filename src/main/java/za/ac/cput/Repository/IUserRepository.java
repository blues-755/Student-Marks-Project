/* IUserRepository.java
    Repository for the User.
    Author: Lunga Tshila (216282934)
    Date: 23 July 2021
 */


package za.ac.cput.Repository;

import za.ac.cput.Entity.User;
import za.ac.cput.Repository.IRepository;

import java.util.Set;

public interface IUserRepository extends IRepository<User, String> {
    public Set<User> getAll();
}
