package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.LevelClass;
import za.ac.cput.Factory.LevelClassFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LevelClassRepositoryTest {
    private static LevelClassRepository repository = new LevelClassRepository();
    private LevelClass levelClass= LevelClassFactory.build("fistyear","A");

    @Test
    void create() {



        LevelClass created = repository.create("second Year","c");
        assertEquals(levelClass.getId(), created.getId());
        System.out.println("Created" + created);
    }

    @Test
    void read() {
        LevelClass read = repository.read(levelClass.getId());
        System.out.println("Read" +read);

    }

    @Test
    void update() {

    }

    @Test
    void delete() {
        repository.delete(levelClass.getId());
        System.out.println("Deleted" + levelClass.getId() + "");
    }
}