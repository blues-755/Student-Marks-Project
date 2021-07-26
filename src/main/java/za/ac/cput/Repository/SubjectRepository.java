/* SubjectRepository.java
    Author: Lwazi Tomson (218204493)
    Date: 25 July 2021
 */

package za.ac.cput.Repository;
import za.ac.cput.Entity.Subject;
import java.util.HashSet;
import java.util.Set;

public class SubjectRepository implements ISubjectRepository{

    private static SubjectRepository subjectRepository = null;
    private Set<Subject> subjectDB = null;

    private SubjectRepository(){
        subjectDB = new HashSet<Subject>();
    }

    public static SubjectRepository getSubjectRepository(){
        if(subjectRepository == null){
            subjectRepository = new SubjectRepository();
        }
        return subjectRepository;
    }



    @Override
    public Subject create(Subject subject) {
        boolean success = subjectDB.add(subject);
        if (!success){
            return null;
        }
        return subject;
    }

    @Override
    public Subject read(String subjectCode) {
        for (Subject subject : subjectDB)
            if (subject.getSubjectCode().equals(subjectCode)){
                return subject;
            }
        return null;
    }

    @Override
    public Subject update(Subject subject) {
        Subject subject1 = read(subject.getSubjectCode());
        if (subject1 != null){
            subjectDB.remove(subject1);
            subjectDB.add(subject);
            return subject;
        }
        return null;
    }

    @Override
    public boolean delete(String subjectCode) {
        Subject subjectToDelete = read(subjectCode);
        if (subjectToDelete == null) {
            return false;
        }
        subjectDB.remove(subjectToDelete);
        return true;
    }
    @Override
    public Set<Subject> getAll() { return subjectDB;}

}
