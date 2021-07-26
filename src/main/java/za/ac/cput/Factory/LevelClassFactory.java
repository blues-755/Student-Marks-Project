
/*
  LevelClass.java
  author:  marco Mulonday 219049505
  date 10/06/2021
 */

package za.ac.cput.Factory;
import za.ac.cput.Entity.LevelClass;


import java.util.UUID;

public class LevelClassFactory {

    public static LevelClass build(String levelName, String grade) {

        try {
            if (levelName.isEmpty() || grade.isEmpty()) {
                return null;
            }
        } catch (NullPointerException e) {
            System.out.println("please Enter all values");
        }


        String levelID = UUID.randomUUID().toString();
        return new LevelClass.builder()
                .setLevelID(levelID)
                .setLevelName(levelName)
                .setGrade(grade)
                .builder();
    }


}