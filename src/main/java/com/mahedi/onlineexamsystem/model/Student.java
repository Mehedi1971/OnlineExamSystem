package com.mahedi.onlineexamsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends BaseModel{
  private String studentName;
  private String studentEmail;
}
