package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.UserFactory;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testNullValues() {

        User p = UserFactory.build(
                "lunga",
                null,
                "luja",
                96,
                216253,
                "071263547");

        System.out.println(p);
        String userid = UUID.randomUUID().toString();
        p = new User.Builder()
                .setUserId(userid)
                .setFirstName("Thembela")
                .setLastName("Abrahams")
                .setGenderId(780205)
                .setContactNumber("0717833838")
                .setClassId(216285)
                .builder();
        System.out.println(p);

        assertNotNull(p);
    }

    @Test
    void testNotNullValues() {

        User p1 = UserFactory.build(
                "Ovayo",
                "Owens",
                "owens@gmail.com",
                78,
                212022,
                "081267597");
        System.out.println(p1);

        String userid = UUID.randomUUID().toString();
      User  p2 = new User.Builder()
                .setUserId(userid)
                .setFirstName("Manesh")
                .setLastName("James")
                .setGenderId(880205)
                .setContactNumber("0817833878")
                .setClassId(219287)
                .setEmail("manesh@yahoo.com")
                .builder();
        System.out.println(p2);

        assertNotNull(p1);
        assertNotNull(p2);

    }
}