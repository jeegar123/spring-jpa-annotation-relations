package com.hiberelation.app.repo;

import com.hiberelation.app.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People,Integer> {
}
