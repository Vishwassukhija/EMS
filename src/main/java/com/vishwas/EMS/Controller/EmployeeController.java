package com.vishwas.EMS.Controller;

import com.vishwas.EMS.Entity.EmployeeEntity;
import com.vishwas.EMS.Model.EmployeeModel;
import com.vishwas.EMS.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/employees")
public class EmployeeController  {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/create")
    public EmployeeEntity createEmployee(@RequestBody EmployeeModel empModel){
        return this.employeeService.createEmployee(empModel);
    }

    @GetMapping("/getAll")
    public List<EmployeeEntity> getemployee(){
        return this.employeeService.getemployee();
    }

    @DeleteMapping("/deletebyId/{empId}")
    public void deleteEmployee(@PathVariable  Long empId){
        this.employeeService.deleteEmployee(empId);
    }

    @GetMapping("/findById/{empId}")
    public EmployeeModel getbyId(@PathVariable Long empId){
        return this.employeeService.getbyId(empId);
    }

    @PutMapping("/updateddata")
    public EmployeeEntity updateddata( @RequestBody EmployeeModel employeeModel){
        return this.employeeService.updateddata(employeeModel);
    }

}
