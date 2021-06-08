/* User.java
    Entity for the User.
    Author: Lunga Tshila (216282934)
    Date: 08 June 2021
 */

package za.ac.cput.Entity;


public class User {

    String userId, firstName, lastName, email, contactNumber;
    int classId, genderId;

    public User(Builder builder) {
        this.userId = builder.userId;
        this.contactNumber = builder.contactNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.classId = builder.classId;
        this.genderId = builder.genderId;
    }

    public static class Builder {

        String userId, firstName, lastName, email, contactNumber;
        private int classId, genderId;

        public Builder setUserId(String userId) {
            this.userId = userId;
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

        public User builder(){
            return new User(this);
        }

        public Builder copy(User user){
            this.userId = user.userId;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.email = user.email;
            this.classId = user.classId;
            this.genderId = user.genderId;
            this.contactNumber = user.contactNumber;
            return this;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", classId=" + classId +
                ", genderId=" + genderId +
                '}';
    }
}
