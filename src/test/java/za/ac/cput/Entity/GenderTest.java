/* Student-Marks-Project.java
 Test for the Gender

 Author: Siyamtanda Tonjeni (217107958)
 Date: 11 June 2021
 */
package za.ac.cput.Entity;

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Disabled;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.Timeout;
        import za.ac.cput.Factory.GenderFactory;

public class GenderTest {
    Gender gender = GenderFactory.createGender("Male");

    @Test
    public void genderTes(){
        Assertions.assertEquals(gender, gender);
        Assertions.assertSame(gender,gender);
    }

    @Test
    @Disabled
    public void disableTest(){
        Assertions.assertEquals(gender, gender);
    }

    @Test
    @Timeout(value = 1000)
    public void testTimeout(){
        Assertions.assertEquals(gender, gender);
    }
}