/* SubjectController.java
    Author: Lwazi Tomson (218204493)
    Date: 14 Aug 2021
 */
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.Subject;
import za.ac.cput.Factory.SubjectFactory;
import za.ac.cput.Service.SubjectService;

import java.util.Set;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value="/create", method= RequestMethod.POST)
    public Subject create(@RequestBody Subject subject){
        Subject newSubject = SubjectFactory.build(subject.getSubjectCode(),
                subject.getSubjectName(),
                subject.getSemester());
                ;
        return subjectService.create(newSubject);
    }

    @GetMapping("/read{id}")
    public Subject read(@PathVariable String id){
        return subjectService.read(id);
    }

    @PostMapping("/update")
    public Subject update(@RequestBody Subject subject){
        return subjectService.update(subject);
    }

    @PostMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return subjectService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Subject> getAll(){
        return subjectService.getAll();
    }
}
