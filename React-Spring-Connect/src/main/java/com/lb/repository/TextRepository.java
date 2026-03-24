package com.lb.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lb.model.TextData;
public interface TextRepository extends JpaRepository<TextData, Long> {

}
