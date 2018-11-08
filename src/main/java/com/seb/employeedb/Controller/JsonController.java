package com.seb.employeedb.Controller;


import com.seb.employeedb.Model.Department;
import com.seb.employeedb.Model.Employee;
import com.seb.employeedb.Repository.DepartmentRepository;
import com.seb.employeedb.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class JsonController {

    @Autowired
    DepartmentRepository departments;
    @Autowired
    EmployeeRepository employees;
    @CrossOrigin
    @RequestMapping("/addemployee")
    public void addEmployee(@RequestBody Employee employee){

        employees.save(employee);
    }
    @CrossOrigin
    @GetMapping("/listdepartments")
    public Iterable<Department> getDepartment(){

        return departments.findAll();
    }
    @CrossOrigin
    @RequestMapping("/adddepartment")
    public void addDepartment(@RequestBody Department department){

        departments.save(department);
    }


}
