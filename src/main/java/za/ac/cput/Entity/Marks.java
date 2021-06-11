/*  Marks.java
    Entity for marks
    Klaus Traubner
    218009496
    11 June 2021
 */

package za.ac.cput.Entity;

public class Marks {

    String getSubject;
    int markID, subjectID, userID, addMark;

    public Marks(Builder builder) {
        this.markID = builder.markID;
        this.subjectID = builder.subjectID;
        this.userID = builder.userID;
        this.addMark = builder.addMark;
        this.getSubject = builder.getSubject;
    }

    public static class Builder {

        private int markID, subjectID, userID, addMark;
        private String getSubject;

        public Builder setMarkID (int markID) {
            this.markID = markID;
            return this;
        }

        public Builder setSubjectID (int subjectID) {
            this.subjectID = subjectID;
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

        public Builder getSubject (String getSubject) {
            this.getSubject = getSubject;
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
            this.getSubject = mark.getSubject;
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
                " getSubject = '" + getSubject + '\'' +
                '}';
    }
}




