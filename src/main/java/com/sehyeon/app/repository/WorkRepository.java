package com.sehyeon.app.repository;

import com.sehyeon.app.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, Long> {
}
