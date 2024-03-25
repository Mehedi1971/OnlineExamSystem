package com.mahedi.onlineexamsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends BaseModel{

  private String teacherName;
  private String teacherEmail;

}
