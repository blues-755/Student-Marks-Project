package za.ac.cput.Service;


    public interface IService <T, ID> {
        T create(T t);
        T read(ID id);
        T update(T t);
        boolean delete(ID id);
}
