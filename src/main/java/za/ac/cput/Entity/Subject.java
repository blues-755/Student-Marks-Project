/* Student-Marks-Project.java
 Entity for the Subject

 Author: Lwazi Tomson (218204493)
 Date: 9 June 2021
 */

package za.ac.cput.Entity;

public class Subject {
    private String subjectCode;
    private String year;
    private String semester;



    private Subject(Builder builder) {
        this.subjectCode=builder.subjectCode;
        this.year=builder.year;
        this.semester=builder.semester;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", year='" + year + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }

    public static class Builder{

        private String subjectCode;
        private String year;
        private String semester;

        public Builder setSubjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }

        public Builder setYear(String year) {
            this.year = year;
            return this;
        }

        public Builder setSemester(String semester) {
            this.semester = semester;
            return this;
        }
        public Subject build(){
            return new Subject(this);
        }
        private Builder copy(Subject subject){
            this.subjectCode=subject.subjectCode;
            this.year=subject.year;
            this.semester=subject.semester;

            return this;
        }

    }

}
