package com.ccell.registration.Controller;

import com.ccell.registration.Entity.StudentRegistrant;
import com.ccell.registration.service.StudentRegistrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/studentDetails")
public class StudentRegistrantController {
    @Autowired
    private StudentRegistrantService StudentRegistrantService;
    @PostMapping("/register")
    public StudentRegistrant register(@RequestBody StudentRegistrant student){
        return StudentRegistrantService.registerStudent(student);
    }
}
