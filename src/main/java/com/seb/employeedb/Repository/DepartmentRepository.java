package com.seb.employeedb.Repository;

import com.seb.employeedb.Model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Integer> {
    Department findAllBydepName(String name);
}
