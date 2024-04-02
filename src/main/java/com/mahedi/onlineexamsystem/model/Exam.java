package com.mahedi.onlineexamsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam extends BaseModel {

  private String title;
  private String description;
  private LocalDate startTime;
  private LocalDate endTime;

  @ManyToOne
  @JoinColumn(name = "teacher_id")
  private Teacher teacher;

  @OneToMany(mappedBy = "exam")
  private List<Question> questions;

  @ManyToMany(mappedBy = "enrolledExams")
  private List<Student> enrolledStudents;

}
