package za.ac.cput.Entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.RoleFactory;
import za.ac.cput.Factory.SubjectClassFactory;

import static org.junit.jupiter.api.Assertions.*;

class SubjectClassTest {
    @Test
    @BeforeEach
    void testNullValues() {
        SubjectClass sc  = SubjectClassFactory.build(
                2894,
                "Grade11",
                2021);
        System.out.println(sc);
    }
}