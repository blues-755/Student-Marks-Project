/*
  LevelClass.java
  author:  marco Mulonday 219049505
  date 10/06/2021
 */


package za.ac.cput.Entity;

public class LevelClass {
    private String levelID;
    private String levelName, grade;


    public LevelClass(builder builder) {
        this.levelID = builder.levelID;
        this.levelName = builder.levelName;
        this.grade = builder.grade;
    }


    public static class builder {
        private String levelID;
        private String levelName, grade;

        public builder setLevelID(String levelID) {
            this.levelID = levelID;
            return this;
        }

        public builder setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }

        public builder setGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public LevelClass build() {

            return new LevelClass(this);
        }
        public builder copy(LevelClass levelClass){

            this.levelID = levelClass.levelID;
            this.levelName = levelClass.levelName;
            this.grade = levelClass.grade;
            return this;
        }

        public LevelClass builder() {
            return new LevelClass(this);
        }
    }
}