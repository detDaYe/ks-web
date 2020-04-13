package com.sehyeon.app.repository;

import com.sehyeon.app.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    //
}
