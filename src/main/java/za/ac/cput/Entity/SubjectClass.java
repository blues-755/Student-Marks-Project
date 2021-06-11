/* SubjectClass.java
 Entity for the SubjectClass
 Author: MMC Tshikuna (218319363)
 Date: 8 June 2021

 */
package za.ac.cput.Entity;

public class SubjectClass {
    private int subjectCode;
    private String levelClassId;
    private int year;

    public SubjectClass(Builder builder) {
        }

        public static class Builder {
            private int subjectCode;
            private String levelClassId;
            private int year;

            public Builder setSubjectCode(int subjectCode) {
                this.subjectCode = subjectCode;
                return this;
            }

            public Builder setLevelClassId(String levelClassId) {
                this.levelClassId = levelClassId;
                return this;
            }

            public Builder setYear(int year) {
                this.year = year;
                return this;
            }

            public za.ac.cput.Entity.SubjectClass build(){

                return new za.ac.cput.Entity.SubjectClass(this);
            }

            public za.ac.cput.Entity.SubjectClass.Builder copy(za.ac.cput.Entity.SubjectClass subjectClass) {
                this.subjectCode = subjectClass.subjectCode;
                this.levelClassId = subjectClass.levelClassId;
                this. year = subjectClass.year;

                return this;
            }

            @Override
            public String toString() {
                return "Builder{" +
                        "subjectCode=" + subjectCode +
                        ", levelClassId=" + levelClassId +
                        ", year=" + year +
                        '}';
            }
        }
}



