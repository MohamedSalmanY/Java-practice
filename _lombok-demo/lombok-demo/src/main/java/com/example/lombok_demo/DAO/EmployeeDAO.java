package com.example.lombok_demo.DAO;

import com.example.lombok_demo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {


}
