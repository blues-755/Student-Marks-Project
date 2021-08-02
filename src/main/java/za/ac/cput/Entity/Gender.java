
/* Student-Marks-Project.java
 Entity for Gender

 Author: Siyamtanda Tonjeni (217107958)
 Date: 10 June 2021
 */

package za.ac.cput.Entity;

public class Gender {
    private String genderId;
    private String description;

    private Gender(Builder builder){
        this.genderId = builder.genderId;
        this.description = builder.description;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId=" + genderId +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String genderId;
        private String description;

        public Builder setGenderId(String genderId) {
            this.genderId = genderId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Gender gender){
            this.genderId = gender.genderId;
            this.description = gender.description;
            return this;
        }
        public Gender build(){
            return new Gender(this);
        }
    }
}