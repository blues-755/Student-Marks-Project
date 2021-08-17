/* Student-Marks-Project.java
 Entity for the Subject
 Author: Lwazi Tomson (218204493)
 Date: 9 June 2021
 */

package za.ac.cput.Entity;

public class Subject {
    //declaration of private fields
    private String subjectCode;
    private String subjectName;
    private String semester;


    //Creating a builder pattern for Subject
    public Subject(Builder builder) {
        this.subjectCode=builder.subjectCode;
        this.subjectName=builder.subjectName;
        this.semester=builder.semester;
    }

    //toString method to return values
    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }

    public static class Builder{

        private String subjectCode;
        private String subjectName;
        private String semester;

        public Builder setSubjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public Builder setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public Builder setSemester(String semester) {
            this.semester = semester;
            return this;
        }

        public Subject build(){
            return new Subject(this);
        }
        // copy constructor to creates an object using another object of the same Java class
        public Builder copy(Subject subject){
            this.subjectCode=subject.subjectCode;
            this.subjectName=subject.subjectName;
            this.semester=subject.semester;

            return this;
        }

        public Subject builder() {
            return build();
        }
    }
    public String getSubjectCode() {
        return subjectCode;
    }
}
