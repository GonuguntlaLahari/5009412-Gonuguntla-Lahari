package com.DigitalNurture.EmployeeManagementSystem.repository;

import com.DigitalNurture.EmployeeManagementSystem.Projection.EmployeeProjection;
import com.DigitalNurture.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Custom query to find employees by department name
    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findEmployeesByDepartmentName(@Param("departmentName") String departmentName);

    // Custom query to find employees with names starting with a specific prefix
    @Query("SELECT e FROM Employee e WHERE e.name LIKE :prefix%")
    List<Employee> findEmployeesByNameStartingWith(@Param("prefix") String prefix);

    // Custom query to find employees by a specific email domain
    @Query("SELECT e FROM Employee e WHERE e.email LIKE %:domain")
    List<Employee> findEmployeesByEmailDomain(@Param("domain") String domain);
    Page<Employee> findByDepartmentName(String departmentName, Pageable pageable);

    // Method to find employees by name containing a substring with pagination
    Page<Employee> findByNameContaining(String substring, Pageable pageable);

    // Method to find employees by email domain with pagination
    Page<Employee> findByEmailContaining(String domain, Pageable pageable);
    @Query("SELECT e FROM Employee e")
    List<EmployeeProjection> findAllEmployeeProjections();
}
