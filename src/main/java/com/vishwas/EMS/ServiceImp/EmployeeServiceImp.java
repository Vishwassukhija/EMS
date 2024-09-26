package com.vishwas.EMS.ServiceImp;

import com.vishwas.EMS.Entity.EmployeeEntity;
import com.vishwas.EMS.Model.EmployeeModel;
import com.vishwas.EMS.Repositry.EmployeeRepo;
import com.vishwas.EMS.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class EmployeeServiceImp implements EmployeeService {

        @Autowired
        public EmployeeRepo empRepo;


        @Override
        public EmployeeEntity createEmployee(EmployeeModel empModel){
            EmployeeEntity empEntity = new EmployeeEntity();

            empEntity.setName(empModel.getName());
            empEntity.setEmail(empModel.getEmail());
            empEntity.setDob(empModel.getDob());
            empEntity.setAddress(empModel.getAddress());
            empEntity.setDesignation(empModel.getDesignation());
            empEntity.setMobileNo(empModel.getMobileNo());
            empEntity.setDepartment(empModel.getDepartment());

             this.empRepo.save(empEntity);


             return empEntity;
        };


        @Override
        public List<EmployeeEntity> getemployee(){
            List<EmployeeEntity> employeeEntities= new ArrayList<>();
            employeeEntities=empRepo.findAll();
            return employeeEntities;
        }


        @Override
        public void deleteEmployee(Long empId){
            Optional<EmployeeEntity> deleteById;
            empRepo.deleteById(empId);
        }


        public EmployeeModel getbyId(Long empId) {
            Optional<EmployeeEntity> find = empRepo.findById(empId);
            EmployeeModel employeeModel = new EmployeeModel();

            if (find.isPresent()) {

                    employeeModel.setEmpId(find.get().getEmpId());
                    employeeModel.setName(find.get().getName());
                    employeeModel.setEmail(find.get().getEmail());
                    employeeModel.setDesignation(find.get().getDesignation());


            }return (employeeModel);
        }


        @Override
        public EmployeeEntity updateddata(EmployeeModel employeeModel){


            Optional<EmployeeEntity> finds  = empRepo.findById(employeeModel.getEmpId());

            EmployeeEntity fill = new EmployeeEntity();
            if(finds.isPresent()){


                fill.setEmpId(employeeModel.getEmpId());
                fill.setName(employeeModel.getName());
                fill.setName(employeeModel.getName());
                fill.setEmail(employeeModel.getEmail());
                fill.setDob(employeeModel.getDob());
                fill.setAddress(employeeModel.getAddress());
                fill.setDesignation(employeeModel.getDesignation());
                fill.setMobileNo(employeeModel.getMobileNo());
                fill.setDepartment(employeeModel.getDepartment());


                empRepo.save(fill);
            }
            return fill;

        }
}

