package com.seb.employeedb.Repository;

import com.seb.employeedb.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
