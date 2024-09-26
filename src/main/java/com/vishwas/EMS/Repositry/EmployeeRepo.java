package com.vishwas.EMS.Repositry;

import com.vishwas.EMS.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository <EmployeeEntity, Long>{


}

