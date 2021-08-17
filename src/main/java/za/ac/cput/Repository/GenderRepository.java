/* Student-Marks-Project.java
 Repository for Gender

 Author: Siyamtanda Tonjeni (217107958)
 Date: 25 July 2021
 */

package za.ac.cput.Repository;

import za.ac.cput.Entity.Gender;
import za.ac.cput.Factory.GenderFactory;

import java.util.HashSet;
import java.util.Set;

public class GenderRepository {
    private Set<Gender> genderDB;

    public GenderRepository(){
        this.genderDB= new HashSet<>();
    }

    public Gender create(String description){
        Gender gender = GenderFactory.createGender(description);
        this.genderDB.add(gender);
        return gender;
    }
    public Gender read(String genderId){
        Gender gender = null;
        for(Gender g : genderDB){
            if(g.getId().equalsIgnoreCase(genderId)){
                gender = g;
                break;
            }
        }
        return gender;
    }
    public Gender update(Gender gender){
        Gender oldGender = read(gender.getId());
        if(oldGender!= null){
            genderDB.remove(oldGender);
            genderDB.add(gender);
        }
        return gender;
    }
    public Gender delete(String genderId){
        Gender gender = read(genderId);
        if(genderId!=null){
            this.genderDB.remove((gender));
        }
        return null;
    }
}
