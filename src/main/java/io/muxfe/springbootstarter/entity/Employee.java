package io.muxfe.springbootstarter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@AllArgsConstructor
public class Employee {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer empno;
  
  private String ename;
  
  private String job;
  
  @ManyToOne(cascade = CascadeType.ALL)
  private Employee mgr;
  
  private Timestamp hiredate;
  
  private Double sal;
  
  private Double comm;
  
  @ManyToOne(cascade = CascadeType.ALL)
  private Department department;
  
  public Employee() { // for jpa
  }
  
  public Employee(Integer empno) {
    this.empno = empno;
  }
  
}