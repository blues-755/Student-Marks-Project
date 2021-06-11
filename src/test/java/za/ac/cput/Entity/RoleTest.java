package za.ac.cput.Entity;

import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.RoleFactory;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {
    @Test
    void testNullValues() {

        Role r = RoleFactory.build(
                "256",
                "CEO");
        System.out.println(r);

        assertNotNull(r);


    }

}