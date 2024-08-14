package com.DigitalNurture.EmployeeManagementSystem.repository;

import com.DigitalNurture.EmployeeManagementSystem.dto.DepartmentDTO;
import com.DigitalNurture.EmployeeManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("SELECT new com.yourcompany.EmployeeManagementSystem.dto.DepartmentDTO(d.id, d.name) FROM Department d")
    List<DepartmentDTO> findAllDepartmentDTOs();
}
