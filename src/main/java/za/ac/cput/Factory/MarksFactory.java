/*  MarksFactory.java
    Entity for Marks
    Klaus Traubner
    218009496
    11 June 2021
 */

package za.ac.cput.Factory;
import za.ac.cput.Entity.Marks;
import java.util.UUID;

public class MarksFactory {

    public static Marks build (String gSubject, int markID, int subjectID, int userID, int addMark){

        try {
            if (gSubject.isEmpty() || markID<= 0 || subjectID <= 0 || addMark <= 0){
                return null;
            }
        }catch (NullPointerException e){
            System.out.println("Please enter all relevant values: ");
        }

        gSubject = gSubject == null ? "" : gSubject;
        String gsubject = UUID.randomUUID().toString();
        return new Marks.Builder()
                .gSubject(gSubject)
                .setMarkID(markID)
                .setUserID(userID)
                .addMark(addMark)
                .builder();
    }
}
