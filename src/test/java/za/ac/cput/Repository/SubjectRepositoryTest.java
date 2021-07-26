/* SubjectRepositoryTest.java
    Author: Lwazi Tomson (218204493)
    Date: 25 July 2021
 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Subject;
import za.ac.cput.Factory.SubjectFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class SubjectRepositoryTest {
    private static SubjectRepository repository = SubjectRepository.getSubjectRepository();
    private static Subject subject = SubjectFactory.build(
            "PRT232",
            "Project",
            "Second Semester");
    @Test
    void a_create(){
        Subject created = repository.create(subject);
        assertEquals(created.getSubjectCode(), subject.getSubjectCode());
        System.out.println("Create: " + created);
    }

    @Test
    void c_update(){
        Subject updated = new Subject.Builder().copy(subject).setSubjectName("Information System").builder();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete(){
        boolean success = repository.delete(subject.getSubjectCode());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All: ");
        System.out.println(repository.getAll());
    }
}
