package com.vishwas.EMS.Service;

import com.vishwas.EMS.Entity.EmployeeEntity;
import com.vishwas.EMS.Model.EmployeeModel;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {


    public EmployeeEntity createEmployee(EmployeeModel empModel);

    public List<EmployeeEntity> getemployee();

    public void deleteEmployee(Long empId);

    public EmployeeModel getbyId(Long empId);

    public EmployeeEntity updateddata(EmployeeModel employeeModel);
}
