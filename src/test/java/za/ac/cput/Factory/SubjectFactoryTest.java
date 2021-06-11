/* Student-Marks-Project.java
 Entity for the Subject
 Author: Lwazi Tomson (218204493)
 Date: 9 June 2021
 */


package za.ac.cput.Factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Subject;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class SubjectFactoryTest {

    @Test
    void testNullValues() {

        Subject p = SubjectFactory.build(
                "L.S",
                null,
                "Second Semester");

        System.out.println(p);
        String userid = UUID.randomUUID().toString();
        p = new Subject.Builder()
                .setSubjectCode("L.S")
                .setSubjectName("Geography")
                .setSemester("Second Semester")
                .builder();
        System.out.println(p);

        assertNotNull(p);
    }

    @Test
    void testNotNullValues() {

        Subject p1 = SubjectFactory.build(
                "P.S",
                "Physical Sciences",
                "Second Semester");
        System.out.println(p1);

        String userid = UUID.randomUUID().toString();
        Subject p2 = new Subject.Builder()
                .setSubjectCode("Maths")
                .setSubjectName("Mathematics")
                .setSemester("First Semester")
                .builder();
        System.out.println(p2);

        assertNotNull(p1);
        assertNotNull(p2);
    }
    @Test
    public void object_quality()
    {

        // Testing word digits, Maths is not equal to Mathematics
        String subjectCode = "Maths";
        String subjectName = "Mathematics";
        assertNotEquals(subjectCode, subjectName);
    }

    @Test
    public void objectIdentity()
    //Testing identity in subject code and subject name
    {
        String subjectCode = "Maths";
        String subjectName = "Mathematics";
        assertEquals(subjectCode, subjectName);
    }
    @Test
    @Timeout(2)
    public void timeoutPass()
    {
        // to test if method runs in 2 seconds
        int [] arr = new int[3];
        for (int x = 0; x < arr.length; x++)
        {
            System.out.println(arr[x] + x);
        }

    }
    @Test
    @Disabled("Disabled")
    public void disablingTest()
    {
        assertEquals(3,2,3);
    }

}