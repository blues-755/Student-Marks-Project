/*  MarksRepository.java
    Klaus Traubner
    218009496
    26 July 2021
 */

package za.ac.cput.Repository;

    public interface MarksRepository<T, ID>{
        public T create(T t);
        public T read(ID id);
        public T update(T t);
        public boolean delete(ID id);
    }



