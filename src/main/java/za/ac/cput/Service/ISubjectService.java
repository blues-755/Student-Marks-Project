/* ISubjectService.java
    Tomson Lwazi (218204493)
    Date: 14 Aug 2021
 */
package za.ac.cput.Service;

import za.ac.cput.Entity.Subject;

import java.util.Set;

public interface ISubjectService extends IService<Subject, String>{
    Set<Subject> getAll();
}
