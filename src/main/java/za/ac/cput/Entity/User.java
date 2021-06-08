/* User.java
    Entity for the User.
    Author: Lunga Tshila (216282934)
    Date: 08 June 2021
 */

package za.ac.cput.Entity;


public class User {

    String id, firstName, lastName, middleName;
    int age;

    public User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.age = builder.age;
    }

    public static class Builder {

        String id, firstName, lastName, middleName;
        private int age;

        public Builder setId(String id) {
            this.id = id;
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

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
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
            this.middleName = user.middleName;
            this.age = user.age;
            return this;
        }
    }
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                '}';
    }
}
