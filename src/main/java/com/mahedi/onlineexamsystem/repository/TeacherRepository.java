package com.mahedi.onlineexamsystem.repository;

import com.mahedi.onlineexamsystem.model.Teacher;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, UUID> {

}
