/* UserFactory.java
    Entity for the UserFactory.
    Author: Lunga Tshila (216282934)
    Date: 08 June 2021
 */

package za.ac.cput.Factory;
import za.ac.cput.Entity.User;
import java.util.UUID;

public class UserFactory {

    public static User build(String firstName, String lastName, String email, int genderId, int classId, String contactNumber){

        try {
            if (firstName.isEmpty() || lastName.isEmpty() || contactNumber.length()<= 0 || genderId <= 0 || classId <= 0){
                return null;
            }
        }catch (NullPointerException e){
            System.out.println("Enter all values");
        }

        email = email == null ? "" : email;
        String userid = UUID.randomUUID().toString();
        return new User.Builder()
                .setUserId(userid)
                .setFirstName(firstName)
                .setEmail(email)
                .setLastName(lastName)
                .setGenderId(genderId)
                .setContactNumber(contactNumber)
                .setGenderId(genderId)
                .setClassId(classId)
                .builder();
    }
}
