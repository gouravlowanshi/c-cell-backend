package com.ccell.registration.Repository;

import com.ccell.registration.Entity.StudentRegistrant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRegistrantRepository extends MongoRepository<StudentRegistrant , String> {
}
