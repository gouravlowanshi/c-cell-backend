package com.ccell.registration.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class StudentRegistrant {
    @Id
    private String id;
    private String fullName;
    private String email;
    private String phone;
    private String rollNumber;
    private String branch;
    private String year;
}
