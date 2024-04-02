package com.mahedi.onlineexamsystem.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends BaseModel {

  private String teacherName;
  private String teacherEmail;

}
