package com.example.lombok_demo.Service;

import com.example.lombok_demo.DAO.EmployeeDAO;
import com.example.lombok_demo.Entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeDAO employeedao;

    public List<Employee> findAll() {
        return employeedao.findAll();
    }

    public Optional<Employee> findById(Long id) {
        return employeedao.findById(id);
    }

    public Employee save(Employee employee) {
        return employeedao.save(employee);
    }

    public void deleteById(Long id) {
        employeedao.deleteById(id);
    }
}
