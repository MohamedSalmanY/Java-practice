package com.example.lombok_demo.Service;

import com.example.lombok_demo.DAO.DepartmentDAO;
import com.example.lombok_demo.Entity.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentDAO departmentdao;

    public List<Department> findAll() {
        return departmentdao.findAll();
    }

    public Optional<Department> findById(Long id) {
        return departmentdao.findById(id);
    }

    public Department save(Department department) {
        return departmentdao.save(department);
    }

    public void deleteById(Long id) {
        departmentdao.deleteById(id);
    }
}
