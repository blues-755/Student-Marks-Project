/* IService.java
    Author: Lunga Tshila (216282934)
    Date: 29 July 2021
 */
package za.ac.cput.Service;
    public interface IService <T, ID> {
        T create(T t);
        T read(ID id);
        T update(T t);
        boolean delete(ID id);
}
