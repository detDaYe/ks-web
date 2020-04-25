package com.sehyeon.app.repository;

import com.sehyeon.app.entity.Interests;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestsRepository extends JpaRepository<Interests, Long> {
}
