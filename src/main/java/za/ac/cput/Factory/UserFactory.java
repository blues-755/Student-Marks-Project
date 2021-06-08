package za.ac.cput.Factory;


import za.ac.cput.Entity.User;

import java.util.UUID;

public class UserFactory {

    public static User build(String firstName, String email, String lastName, int genderId, int classId, String contactNumber){

        //Complex Configs for null and negative values

        if (firstName.isEmpty() || lastName.isEmpty() || contactNumber.length() <= 0 || email.isEmpty()){
            return null;
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
