/*
SubjectServiceTest.java
Lwazi Tomson (218204493)
14 Aug 20121
 */

package za.ac.cput.Service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Subject;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.SubjectFactory;
import za.ac.cput.Factory.UserFactory;


@TestMethodOrder(MethodOrderer.MethodName.class)

class SubjectServiceTest {
    public static ISubjectService service = SubjectService.getSubjectService();
    public static Subject subject = SubjectFactory.build(
            "ES3",
            "Elective 3",
            "Second Semester"

    );


    @Test
    void create() {
        Subject created = service.create(subject);
        assertEquals(subject.getSubjectCode(), created.getSubjectCode());
        System.out.println("Created: " + created);
    }
    @Test
    void read() {
        Subject read = service.read(subject.getSubjectCode());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        Subject updated = new Subject.Builder().copy(subject).setSemester("Second Semester").builder();
        assertNotNull(service.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void delete() {
        boolean _true = service.delete(subject.getSubjectCode());
        assertTrue(_true);
        System.out.println("Delete: " + _true);
    }

    @Test
    void getAll()  {
        System.out.println("Display All: \n" + service.getAll());
    }

}