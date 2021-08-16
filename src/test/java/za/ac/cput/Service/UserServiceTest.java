package za.ac.cput.Service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;


@TestMethodOrder(MethodOrderer.MethodName.class)
class UserServiceTest {
    private static IUserService service = UserService.getUserService();
    private static User user = UserFactory.build(
            "lunga",
            "tshila",
            "lunga@gmail.com",
            56,
            89,
            "072626363"
    );

    @Test
    void a_create() {
        User created = service.create(user);
        assertEquals(user.getUserId(), created.getUserId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        User read = service.read(user.getUserId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        User updated = new User.Builder().copy(user).setGenderId(78).builder();
        assertNotNull(service.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean _true = service.delete(user.getUserId());
        assertTrue(_true);
        System.out.println("Delete: " + _true);
    }

    @Test
    void d_getAll() {
        System.out.println("Display All: \n" + service.getAll());
    }
}