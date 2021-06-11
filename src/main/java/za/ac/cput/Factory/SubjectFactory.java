/* Student-Marks-Project.java
 Entity for the Subject
 Author: Lwazi Tomson (218204493)
 Date: 9 June 2021
 */

package za.ac.cput.Factory;
import za.ac.cput.Entity.Subject;
import java.util.UUID;

public class SubjectFactory {

    private String subjectCode;
    private String subjectName;
    private String semester;

    public static Subject build(String subjectCode, String subjectName, String semester){

        try {
            if (subjectCode.isEmpty() || subjectName.isEmpty() || semester.length()<= 0){
                return null;
            }
        }catch (NullPointerException e){
            System.out.println("Enter all values");
        }

        semester = semester == null ? "" : semester;
        String SubjectCode = UUID.randomUUID().toString();
        return new Subject.Builder()
                .setSubjectCode(SubjectCode)
                .setSubjectName(subjectName)
                .setSemester(semester)
                .builder();
    }
}
