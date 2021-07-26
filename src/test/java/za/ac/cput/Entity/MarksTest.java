/*  MarksTest.java
    Entity for Marks
    Klaus Traubner
    218009496
    11 June 2021
 */

package za.ac.cput.Entity;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.MarksFactory;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

class MarksTest {

    @Test
    void testNullValues() {

        Marks m = MarksFactory.build(

                "English",
                88795,
                99856,
                213503145,
                55
                );

        System.out.println(m);
        String gSubject = UUID.randomUUID().toString();
        m = new Marks.Builder()
                .gSubject(gSubject)
                .setMarkID(4562)
                .setUserID(213503147)
                .addMark(55)
                .setSubjectID(45)
                .builder();
        System.out.println(m);

        assertNotNull(m);
    }

    @Test
    void testNotNullValues() {

        Marks m1 = MarksFactory.build(
                "Geography",
                448,
                55632,
                212578234,
                65
              );
        System.out.println(m1);

        String gSubject = UUID.randomUUID().toString();

        Marks  m2 = new Marks.Builder()
                .gSubject(gSubject)
                .setSubjectID(222)
                .setMarkID(555)
                .setUserID(218009496)
                .addMark(88)
                .builder();

        System.out.println(m2);

        assertNotNull(m1);
        assertNotNull(m2);

    }
}