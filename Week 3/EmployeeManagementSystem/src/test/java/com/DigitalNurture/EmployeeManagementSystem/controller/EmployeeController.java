package com.DigitalNurture.EmployeeManagementSystem.controller;
import com.DigitalNurture.EmployeeManagementSystem.entity.Employee;
import com.DigitalNurture.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import org.springframework.data.domain.Sort;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        return ResponseEntity.ok(employeeService.updateEmployee(id, employeeDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/by-department")
    public Page<Employee> getEmployeesByDepartmentName(
            @RequestParam String departmentName,
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String sortBy) {
        
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return employeeService.getEmployeesByDepartmentName(departmentName, pageable);
    }

    // Endpoint to get employees by name containing a substring with pagination
    @GetMapping("/by-name")
    public Page<Employee> getEmployeesByNameContaining(
            @RequestParam String substring,
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String sortBy) {
        
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return employeeService.getEmployeesByNameContaining(substring, pageable);
    }

    // Endpoint to get employees by email domain with pagination
    @GetMapping("/by-email")
    public Page<Employee> getEmployeesByEmailContaining(
            @RequestParam String domain,
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String sortBy) {
        
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return employeeService.getEmployeesByEmailContaining(domain, pageable);
    }
}
