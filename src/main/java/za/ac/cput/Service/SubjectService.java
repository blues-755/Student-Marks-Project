/*
SubjectService.java
Tomson Lwazi (218204493)
14 Aug 2021

 */
package za.ac.cput.Service;

import za.ac.cput.Entity.Subject;
import za.ac.cput.Repository.SubjectRepository;
import za.ac.cput.Repository.UserRepository;

import java.util.Set;

public class SubjectService implements ISubjectService{

    private static SubjectService subjectService = null;
    private SubjectRepository subjectRepository;

    public SubjectService(){
        this.subjectRepository= SubjectRepository.getSubjectRepository();
    }
    public static SubjectService getSubjectService(){
        if(subjectService==null){
            subjectService = new SubjectService();
        }
        return subjectService;
    }


    @Override
    public Subject create(Subject subject) {
        return this.subjectRepository.create(subject);
    }

    @Override
    public Subject read(String s) {
        return this.subjectRepository.read(s);
    }

    @Override
    public Subject update(Subject subject) {
        return this.subjectRepository.update(subject);
    }

    @Override
    public boolean delete(String s) {
        return this.subjectRepository.delete(s);
    }

    @Override
    public Set<Subject> getAll() {
        return this.subjectRepository.getAll();
    }
}
