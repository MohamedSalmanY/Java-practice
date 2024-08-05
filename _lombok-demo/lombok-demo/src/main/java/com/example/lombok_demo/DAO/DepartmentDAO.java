package com.example.lombok_demo.DAO;

import com.example.lombok_demo.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDAO extends JpaRepository<Department, Long> {

}
