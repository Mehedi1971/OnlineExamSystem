package com.mahedi.onlineexamsystem.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question extends  BaseModel{
  private String content;
  private String options;
  private String correctAnswer;

  @ManyToOne
  @JoinColumn(name = "exam_id")
  private Exam exam;
}
