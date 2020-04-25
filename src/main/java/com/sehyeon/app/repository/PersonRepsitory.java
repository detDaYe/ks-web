package com.sehyeon.app.repository;

import com.sehyeon.app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepsitory extends JpaRepository<Person, Long> {
}
