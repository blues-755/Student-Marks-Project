package za.ac.cput.Repository;

import za.ac.cput.Entity.User;

public interface IRepository<T, ID>{
    public T create(T t);
    public T read(ID id);
    public T update(T t);
    public boolean delete(ID id);
}
