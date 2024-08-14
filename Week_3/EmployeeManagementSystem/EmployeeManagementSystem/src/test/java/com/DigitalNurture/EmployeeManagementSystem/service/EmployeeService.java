package com.DigitalNurture.EmployeeManagementSystem.service;
import com.DigitalNurture.EmployeeManagementSystem.entity.Employee;
import com.DigitalNurture.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository EmployeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        employee.setName(employeeDetails.getName());
        employee.setEmail(employeeDetails.getEmail());
        employee.setDepartment(employeeDetails.getDepartment());
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    public Page<Employee> getEmployeesByDepartmentName(String departmentName, Pageable pageable) {
        return employeeRepository.findByDepartmentName(departmentName, pageable);
    }

    // Method to get employees by name containing a substring with pagination
    public Page<Employee> getEmployeesByNameContaining(String substring, Pageable pageable) {
        return employeeRepository.findByNameContaining(substring, pageable);
    }

    // Method to get employees by email domain with pagination
    public Page<Employee> getEmployeesByEmailContaining(String domain, Pageable pageable) {
        return employeeRepository.findByEmailContaining(domain, pageable);
    }
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void saveEmployees(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            employeeRepository.save(employees.get(i));
            if (i % 30 == 0) { // Apply batching
                employeeRepository.flush();
                employeeRepository.deleteAll();
            }
        }
    }
}

