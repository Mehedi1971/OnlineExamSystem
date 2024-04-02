package com.mahedi.onlineexamsystem.model;

import com.mahedi.onlineexamsystem.enums.ActiveStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID id;

  @Column(updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date createAt;

  @Temporal(TemporalType.TIMESTAMP)
  private Date updateAt;
  private Integer activeStatus;

  @PrePersist
  public void setPreInsertData(){
    this.createAt=new Date();
    if(this.activeStatus==null){
      this.activeStatus= ActiveStatus.ACTIVE.getValue();
    }
  }

  @PreUpdate
  public void setPreUpdateData(){
    this.updateAt=new Date();
  }
}
