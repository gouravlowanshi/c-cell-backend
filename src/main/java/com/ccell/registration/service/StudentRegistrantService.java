package com.ccell.registration.service;

import com.ccell.registration.Entity.StudentRegistrant;
import com.ccell.registration.Repository.StudentRegistrantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentRegistrantService {
    @Autowired
    private StudentRegistrantRepository StudentRegistrantRepository;

    public StudentRegistrant registerStudent(StudentRegistrant student){
        return StudentRegistrantRepository.save(student);
    }
}
