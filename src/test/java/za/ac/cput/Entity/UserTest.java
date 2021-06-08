package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.UserFactory;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testUsingBuildMethod(){

        User p1 = UserFactory.build("lunga", null,"lunga@gmail.com", 900102566,
                21435, "02334343434");
        System.out.println(p1);
        User p2 = UserFactory.build("Ovayo", "Tshila","ovie@yahoo", 200102566,
                61435, "08334343434");
        System.out.println(p2);
        assertNotNull(p1);
        assertNotNull(p2);
    }

    @Test
    void testUsingFactoryAddingMoreUserAttributes(){

        User p1 = UserFactory.build("Thembela", null,"thembela@gmail.com", 700102566,
                41435, "09334343434");
        System.out.println(p1);
        String userId = UUID.randomUUID().toString();
        p1 = new User.Builder()
                .setUserId(userId)
                .setFirstName("Manesh")
                .setLastName("Kwaza")
                .setEmail("Manesh@icloud.com")
                .setContactNumber("07235474929")
                .setGenderId(78363520)
                .setClassId(5468)
                .builder();

        System.out.println(p1);
        assertNotNull(p1);

    }
}