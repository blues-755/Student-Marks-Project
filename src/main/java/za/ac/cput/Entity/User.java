/* User.java
    Entity for the User.
    Author: Lunga Tshila (216282934)
    Date: 08 June 2021
 */

package za.ac.cput.Entity;


public class User {

    String id, firstName, lastName, email, contactNumber;
    int age, classId, genderId;

    public User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.age = builder.age;
        this.classId = builder.classId;
        this.genderId = builder.genderId;
    }

    public static class Builder {

        String id, firstName, lastName, email, contactNumber;
        private int age, classId, genderId;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setGenderId(int genderId) {
            this.genderId = genderId;
            return this;
        }

        public Builder setClassId(int classId) {
            this.classId = classId;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public User builder(){
            return new User(this);
        }

        //takes user attributes and initializes them to builder class.
        public Builder copy(User user){
            this.id = user.id;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.email = user.email;
            this.age = user.age;
            this.classId = user.classId;
            this.genderId = user.genderId;
            this.contactNumber = user.contactNumber;
            return this;
        }
    }
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
