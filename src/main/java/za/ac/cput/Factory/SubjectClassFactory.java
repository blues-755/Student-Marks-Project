package za.ac.cput.Factory;

import za.ac.cput.Entity.SubjectClass;

public class SubjectClassFactory {


    public static SubjectClass build(int subjectCode, String levelClassId, int year) {

        try {
            if (levelClassId.isEmpty())  {
                return null;
            }
        } catch (NullPointerException e) {
            System.out.println("Enter your Grade");
        }


        return new SubjectClass.Builder()
                .setSubjectCode(subjectCode)
                .setLevelClassId(levelClassId)
                .setYear(year)
                .build();

    }
}