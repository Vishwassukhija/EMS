package com.vishwas.EMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AssestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long assestId;
    private String assestName;
    private String assestBrand;
    private String assestModel;
    private long empId;
}
