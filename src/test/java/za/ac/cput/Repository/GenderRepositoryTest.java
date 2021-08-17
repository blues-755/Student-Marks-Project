/* Student-Marks-Project.java
 Repository test for Gender

 Author: Siyamtanda Tonjeni (217107958)
 Date: 25 July 2021
 */

package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Gender;
import za.ac.cput.Factory.GenderFactory;

import static org.junit.jupiter.api.Assertions.*;

public class GenderRepositoryTest {
    private static GenderRepository repository = new GenderRepository();
    private Gender gender = GenderFactory.createGender("Male");

    @Test
    public void create(){
        Gender created = repository.create("Male");
        assertEquals(gender.getId(), created.getId());
        System.out.println("Created" + created);
    }

    @Test
    public void update(){
        Gender updated = new Gender.Builder().copy(gender).setDescription("Male").build();
        System.out.println("Updated" + updated);
    }

    @Test
    public void read(){
        Gender read = repository.read(gender.getId());
        System.out.println("Read" +read);
    }

    @Test
    public void delete(){
        repository.delete(gender.getId());
        System.out.println("Deleted" + gender.getId() + "");
    }

}
