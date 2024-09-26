package com.vishwas.EMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.function.Function;

@Entity
@Data

public class EmployeeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long empId;
  private String name;
  private String address;
  private String mobileNo;
  private String email;
  private String dob;
  private String qualification;
  private String designation;
  private String department;
  private String role;
  private  String doj;

}
