/* ISubjectRepository.java
    Repository for the User.
    Author: Lwazi Tomson (218204493)
    Date: 25 July 2021
 */


package za.ac.cput.Repository;

import za.ac.cput.Entity.Subject;
import za.ac.cput.Repository.IRepository;

import java.util.Set;

public interface ISubjectRepository extends IRepository<Subject, String> {
    public Set<Subject> getAll();
}
