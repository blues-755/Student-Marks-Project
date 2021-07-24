package za.ac.cput.Repository;

import za.ac.cput.Entity.User;
import za.ac.cput.Repository.IRepository;

import java.util.Set;

public interface IUserRepository extends IRepository<User, String> {
    public Set<User> getAll();
}
