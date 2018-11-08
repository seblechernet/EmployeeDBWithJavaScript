package com.seb.employeedb.Model;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long empId;
    private String name;
    private String jobTitle;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="department_id")
    @JsonIgnore
    private com.seb.employeedb.Model.Department department;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitleitle() {
        return jobTitle;
    }

    public void setJobTitle(String title) {
        this.jobTitle = title;
    }

    public com.seb.employeedb.Model.Department getDepartment() {
        return department;
    }

    public void setDepartment(com.seb.employeedb.Model.Department department) {
        this.department = department;
    }
}
