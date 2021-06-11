/*  Marks.java
    Entity for marks
    Klaus Traubner
    218009496
    11 June 2021
 */

package za.ac.cput.Entity;

public class Marks {

    String gSubject;
    int markID, subjectID, userID, addMark;

    public Marks(Builder builder) {
        this.subjectID = builder.subjectID;
        this.markID = builder.markID;
        this.userID = builder.userID;
        this.addMark = builder.addMark;
        this.gSubject = builder.gSubject;
    }

    public static class Builder {

        private int markID, subjectID, userID, addMark;
        private String gSubject;


        public Builder setSubjectID (int subjectID) {
            this.subjectID = subjectID;
            return this;
        }

        public Builder setMarkID (int markID) {
            this.markID = markID;
            return this;
        }

        public Builder setUserID (int userID) {
            this.userID = userID;
            return this;
        }

        public Builder addMark (int addMark) {
            this.addMark = addMark;
            return this;
        }

        public Builder gSubject (String gSubject) {
            this.gSubject = gSubject;
            return this;
        }

        public Marks builder (){
            return new Marks(this);
        }

        public Builder copy (Marks mark){
            this.subjectID = mark.subjectID;
            this.markID = mark.markID;
            this.userID = mark.userID;
            this.addMark = mark.addMark;
            this.gSubject = mark.gSubject;
            return this;
        }
    }

    @Override
    public String toString() {
        return " Mark { " +
                " subjectID = '" + subjectID + '\'' +
                " markID = '" + markID + '\'' +
                " userID = '" + userID + '\'' +
                " addMark = '" + addMark + '\'' +
                " getSubject = '" + gSubject + '\'' +
                '}';
    }
}




