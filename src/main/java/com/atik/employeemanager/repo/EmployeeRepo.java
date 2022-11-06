package com.atik.employeemanager.repo;

import com.atik.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository <Employee, Long>{
//    Optional<Employee> findById(Long id);
//    List<Employee> findEmployeeByEmail(String email);

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
