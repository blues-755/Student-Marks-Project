
/* Student-Marks-Project.java
 Factory for the Gender

 Author: Siyamtanda Tonjeni (217107958)
 Date: 11 June 2021
 */
package za.ac.cput.Factory;

        import za.ac.cput.Entity.Gender;
        import za.ac.cput.Util.GenericHelper;

public class GenderFactory {
    public static Gender createGender(String description){
        String genderId = GenericHelper.generateId();
        Gender gender = new Gender.Builder()
                .setGenderId(genderId)
                .setDescription(description)
                .build();
        return gender;
    }
}