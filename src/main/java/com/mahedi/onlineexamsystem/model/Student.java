package com.mahedi.onlineexamsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends BaseModel {

  private String studentName;
  private String studentEmail;
  @ManyToMany
  @JoinTable(
      name = "exam_student",
      joinColumns = @JoinColumn(name = "student_id"),
      inverseJoinColumns = @JoinColumn(name = "exam_id")
  )
  private Set<Exam> enrolledExams;
}
