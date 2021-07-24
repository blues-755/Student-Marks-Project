/* UserRepositoryTest.java
    Interface repository for the User.
    Author: Lunga Tshila (216282934)
    Date: 23 July 2021
 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class UserRepositoryTest {
    private static UserRepository repository = UserRepository.getUserRepository();
    private static User user = UserFactory.build(
                "Lunga",
                "Tshila",
                "lunga@gmail.com",
                950605,
                535366,
                "072354687");

    @Test
    void a_create(){
        User created = repository.create(user);
        assertEquals(created.getUserId(), user.getUserId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read(){
        User read = repository.read(user.getUserId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update(){
        User updated = new User.Builder().copy(user).setFirstName("Lungatshila").builder();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete(){
        boolean success = repository.delete(user.getUserId());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All: ");
        System.out.println(repository.getAll());
    }
}

